/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.sentry.policy.indexer;

import java.util.Set;

import org.apache.sentry.core.common.ActiveRoleSet;
import org.apache.sentry.core.common.Authorizable;
import org.apache.sentry.core.common.exception.SentryConfigurationException;
import org.apache.sentry.policy.common.PrivilegeFactory;
import org.apache.sentry.policy.common.PolicyEngine;
import org.apache.sentry.provider.common.ProviderBackend;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.collect.ImmutableSet;

/**
 * A PolicyEngine for an indexer service.
 */
public class SimpleIndexerPolicyEngine implements PolicyEngine {

  private static final Logger LOGGER = LoggerFactory
      .getLogger(SimpleIndexerPolicyEngine.class);

  private final ProviderBackend providerBackend;

  public SimpleIndexerPolicyEngine(ProviderBackend providerBackend) {
    this.providerBackend = providerBackend;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public PrivilegeFactory getPrivilegeFactory() {
    return new IndexerWildcardPrivilege.IndexerWildcardPrivilegeFactory();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public ImmutableSet<String> getAllPrivileges(Set<String> groups,
      ActiveRoleSet roleSet) throws SentryConfigurationException {
    return getPrivileges(groups, roleSet);
  }

  @Override
  public ImmutableSet<String> getAllPrivileges(Set<String> groups, Set<String> users,
      ActiveRoleSet roleSet) throws SentryConfigurationException {
    return getPrivileges(groups, users, roleSet);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public ImmutableSet<String> getPrivileges(Set<String> groups, ActiveRoleSet roleSet, Authorizable... authorizationHierarchy ) {
    if(LOGGER.isDebugEnabled()) {
      LOGGER.debug("Getting permissions for {}", groups);
    }
    ImmutableSet<String> result = providerBackend.getPrivileges(groups, roleSet);
    if(LOGGER.isDebugEnabled()) {
      LOGGER.debug("result = " + result);
    }
    return result;
  }

  @Override
  public ImmutableSet<String> getPrivileges(Set<String> groups, Set<String> users,
      ActiveRoleSet roleSet, Authorizable... authorizationHierarchy) {
    if(LOGGER.isDebugEnabled()) {
      LOGGER.debug("Getting permissions for groups: {}, users: {}", groups, users);
    }
    ImmutableSet<String> result = providerBackend.getPrivileges(groups, users, roleSet);
    if(LOGGER.isDebugEnabled()) {
      LOGGER.debug("result = " + result);
    }
    return result;
  }

  @Override
  public void validatePolicy(boolean strictValidation)
      throws SentryConfigurationException {
    throw new SentryConfigurationException("Not implemented yet");
  }

  @Override
  public void close() {
    if (providerBackend != null) {
      providerBackend.close();
    }
  }

}
