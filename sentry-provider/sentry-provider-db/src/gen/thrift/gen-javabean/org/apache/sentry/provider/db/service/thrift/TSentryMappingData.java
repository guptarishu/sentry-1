/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.sentry.provider.db.service.thrift;

import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TSentryMappingData implements org.apache.thrift.TBase<TSentryMappingData, TSentryMappingData._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TSentryMappingData");

  private static final org.apache.thrift.protocol.TField GROUP_ROLES_MAP_FIELD_DESC = new org.apache.thrift.protocol.TField("groupRolesMap", org.apache.thrift.protocol.TType.MAP, (short)1);
  private static final org.apache.thrift.protocol.TField ROLE_PRIVILEGES_MAP_FIELD_DESC = new org.apache.thrift.protocol.TField("rolePrivilegesMap", org.apache.thrift.protocol.TType.MAP, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TSentryMappingDataStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TSentryMappingDataTupleSchemeFactory());
  }

  private Map<String,Set<String>> groupRolesMap; // optional
  private Map<String,Set<TSentryPrivilege>> rolePrivilegesMap; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    GROUP_ROLES_MAP((short)1, "groupRolesMap"),
    ROLE_PRIVILEGES_MAP((short)2, "rolePrivilegesMap");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // GROUP_ROLES_MAP
          return GROUP_ROLES_MAP;
        case 2: // ROLE_PRIVILEGES_MAP
          return ROLE_PRIVILEGES_MAP;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private _Fields optionals[] = {_Fields.GROUP_ROLES_MAP,_Fields.ROLE_PRIVILEGES_MAP};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.GROUP_ROLES_MAP, new org.apache.thrift.meta_data.FieldMetaData("groupRolesMap", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.SetMetaData(org.apache.thrift.protocol.TType.SET, 
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)))));
    tmpMap.put(_Fields.ROLE_PRIVILEGES_MAP, new org.apache.thrift.meta_data.FieldMetaData("rolePrivilegesMap", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.SetMetaData(org.apache.thrift.protocol.TType.SET, 
                new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TSentryPrivilege.class)))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TSentryMappingData.class, metaDataMap);
  }

  public TSentryMappingData() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TSentryMappingData(TSentryMappingData other) {
    if (other.isSetGroupRolesMap()) {
      Map<String,Set<String>> __this__groupRolesMap = new HashMap<String,Set<String>>();
      for (Map.Entry<String, Set<String>> other_element : other.groupRolesMap.entrySet()) {

        String other_element_key = other_element.getKey();
        Set<String> other_element_value = other_element.getValue();

        String __this__groupRolesMap_copy_key = other_element_key;

        Set<String> __this__groupRolesMap_copy_value = new HashSet<String>();
        for (String other_element_value_element : other_element_value) {
          __this__groupRolesMap_copy_value.add(other_element_value_element);
        }

        __this__groupRolesMap.put(__this__groupRolesMap_copy_key, __this__groupRolesMap_copy_value);
      }
      this.groupRolesMap = __this__groupRolesMap;
    }
    if (other.isSetRolePrivilegesMap()) {
      Map<String,Set<TSentryPrivilege>> __this__rolePrivilegesMap = new HashMap<String,Set<TSentryPrivilege>>();
      for (Map.Entry<String, Set<TSentryPrivilege>> other_element : other.rolePrivilegesMap.entrySet()) {

        String other_element_key = other_element.getKey();
        Set<TSentryPrivilege> other_element_value = other_element.getValue();

        String __this__rolePrivilegesMap_copy_key = other_element_key;

        Set<TSentryPrivilege> __this__rolePrivilegesMap_copy_value = new HashSet<TSentryPrivilege>();
        for (TSentryPrivilege other_element_value_element : other_element_value) {
          __this__rolePrivilegesMap_copy_value.add(new TSentryPrivilege(other_element_value_element));
        }

        __this__rolePrivilegesMap.put(__this__rolePrivilegesMap_copy_key, __this__rolePrivilegesMap_copy_value);
      }
      this.rolePrivilegesMap = __this__rolePrivilegesMap;
    }
  }

  public TSentryMappingData deepCopy() {
    return new TSentryMappingData(this);
  }

  @Override
  public void clear() {
    this.groupRolesMap = null;
    this.rolePrivilegesMap = null;
  }

  public int getGroupRolesMapSize() {
    return (this.groupRolesMap == null) ? 0 : this.groupRolesMap.size();
  }

  public void putToGroupRolesMap(String key, Set<String> val) {
    if (this.groupRolesMap == null) {
      this.groupRolesMap = new HashMap<String,Set<String>>();
    }
    this.groupRolesMap.put(key, val);
  }

  public Map<String,Set<String>> getGroupRolesMap() {
    return this.groupRolesMap;
  }

  public void setGroupRolesMap(Map<String,Set<String>> groupRolesMap) {
    this.groupRolesMap = groupRolesMap;
  }

  public void unsetGroupRolesMap() {
    this.groupRolesMap = null;
  }

  /** Returns true if field groupRolesMap is set (has been assigned a value) and false otherwise */
  public boolean isSetGroupRolesMap() {
    return this.groupRolesMap != null;
  }

  public void setGroupRolesMapIsSet(boolean value) {
    if (!value) {
      this.groupRolesMap = null;
    }
  }

  public int getRolePrivilegesMapSize() {
    return (this.rolePrivilegesMap == null) ? 0 : this.rolePrivilegesMap.size();
  }

  public void putToRolePrivilegesMap(String key, Set<TSentryPrivilege> val) {
    if (this.rolePrivilegesMap == null) {
      this.rolePrivilegesMap = new HashMap<String,Set<TSentryPrivilege>>();
    }
    this.rolePrivilegesMap.put(key, val);
  }

  public Map<String,Set<TSentryPrivilege>> getRolePrivilegesMap() {
    return this.rolePrivilegesMap;
  }

  public void setRolePrivilegesMap(Map<String,Set<TSentryPrivilege>> rolePrivilegesMap) {
    this.rolePrivilegesMap = rolePrivilegesMap;
  }

  public void unsetRolePrivilegesMap() {
    this.rolePrivilegesMap = null;
  }

  /** Returns true if field rolePrivilegesMap is set (has been assigned a value) and false otherwise */
  public boolean isSetRolePrivilegesMap() {
    return this.rolePrivilegesMap != null;
  }

  public void setRolePrivilegesMapIsSet(boolean value) {
    if (!value) {
      this.rolePrivilegesMap = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case GROUP_ROLES_MAP:
      if (value == null) {
        unsetGroupRolesMap();
      } else {
        setGroupRolesMap((Map<String,Set<String>>)value);
      }
      break;

    case ROLE_PRIVILEGES_MAP:
      if (value == null) {
        unsetRolePrivilegesMap();
      } else {
        setRolePrivilegesMap((Map<String,Set<TSentryPrivilege>>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case GROUP_ROLES_MAP:
      return getGroupRolesMap();

    case ROLE_PRIVILEGES_MAP:
      return getRolePrivilegesMap();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case GROUP_ROLES_MAP:
      return isSetGroupRolesMap();
    case ROLE_PRIVILEGES_MAP:
      return isSetRolePrivilegesMap();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TSentryMappingData)
      return this.equals((TSentryMappingData)that);
    return false;
  }

  public boolean equals(TSentryMappingData that) {
    if (that == null)
      return false;

    boolean this_present_groupRolesMap = true && this.isSetGroupRolesMap();
    boolean that_present_groupRolesMap = true && that.isSetGroupRolesMap();
    if (this_present_groupRolesMap || that_present_groupRolesMap) {
      if (!(this_present_groupRolesMap && that_present_groupRolesMap))
        return false;
      if (!this.groupRolesMap.equals(that.groupRolesMap))
        return false;
    }

    boolean this_present_rolePrivilegesMap = true && this.isSetRolePrivilegesMap();
    boolean that_present_rolePrivilegesMap = true && that.isSetRolePrivilegesMap();
    if (this_present_rolePrivilegesMap || that_present_rolePrivilegesMap) {
      if (!(this_present_rolePrivilegesMap && that_present_rolePrivilegesMap))
        return false;
      if (!this.rolePrivilegesMap.equals(that.rolePrivilegesMap))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_groupRolesMap = true && (isSetGroupRolesMap());
    builder.append(present_groupRolesMap);
    if (present_groupRolesMap)
      builder.append(groupRolesMap);

    boolean present_rolePrivilegesMap = true && (isSetRolePrivilegesMap());
    builder.append(present_rolePrivilegesMap);
    if (present_rolePrivilegesMap)
      builder.append(rolePrivilegesMap);

    return builder.toHashCode();
  }

  public int compareTo(TSentryMappingData other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TSentryMappingData typedOther = (TSentryMappingData)other;

    lastComparison = Boolean.valueOf(isSetGroupRolesMap()).compareTo(typedOther.isSetGroupRolesMap());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGroupRolesMap()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.groupRolesMap, typedOther.groupRolesMap);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRolePrivilegesMap()).compareTo(typedOther.isSetRolePrivilegesMap());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRolePrivilegesMap()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.rolePrivilegesMap, typedOther.rolePrivilegesMap);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TSentryMappingData(");
    boolean first = true;

    if (isSetGroupRolesMap()) {
      sb.append("groupRolesMap:");
      if (this.groupRolesMap == null) {
        sb.append("null");
      } else {
        sb.append(this.groupRolesMap);
      }
      first = false;
    }
    if (isSetRolePrivilegesMap()) {
      if (!first) sb.append(", ");
      sb.append("rolePrivilegesMap:");
      if (this.rolePrivilegesMap == null) {
        sb.append("null");
      } else {
        sb.append(this.rolePrivilegesMap);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TSentryMappingDataStandardSchemeFactory implements SchemeFactory {
    public TSentryMappingDataStandardScheme getScheme() {
      return new TSentryMappingDataStandardScheme();
    }
  }

  private static class TSentryMappingDataStandardScheme extends StandardScheme<TSentryMappingData> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TSentryMappingData struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // GROUP_ROLES_MAP
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map132 = iprot.readMapBegin();
                struct.groupRolesMap = new HashMap<String,Set<String>>(2*_map132.size);
                for (int _i133 = 0; _i133 < _map132.size; ++_i133)
                {
                  String _key134; // required
                  Set<String> _val135; // required
                  _key134 = iprot.readString();
                  {
                    org.apache.thrift.protocol.TSet _set136 = iprot.readSetBegin();
                    _val135 = new HashSet<String>(2*_set136.size);
                    for (int _i137 = 0; _i137 < _set136.size; ++_i137)
                    {
                      String _elem138; // required
                      _elem138 = iprot.readString();
                      _val135.add(_elem138);
                    }
                    iprot.readSetEnd();
                  }
                  struct.groupRolesMap.put(_key134, _val135);
                }
                iprot.readMapEnd();
              }
              struct.setGroupRolesMapIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ROLE_PRIVILEGES_MAP
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map139 = iprot.readMapBegin();
                struct.rolePrivilegesMap = new HashMap<String,Set<TSentryPrivilege>>(2*_map139.size);
                for (int _i140 = 0; _i140 < _map139.size; ++_i140)
                {
                  String _key141; // required
                  Set<TSentryPrivilege> _val142; // required
                  _key141 = iprot.readString();
                  {
                    org.apache.thrift.protocol.TSet _set143 = iprot.readSetBegin();
                    _val142 = new HashSet<TSentryPrivilege>(2*_set143.size);
                    for (int _i144 = 0; _i144 < _set143.size; ++_i144)
                    {
                      TSentryPrivilege _elem145; // required
                      _elem145 = new TSentryPrivilege();
                      _elem145.read(iprot);
                      _val142.add(_elem145);
                    }
                    iprot.readSetEnd();
                  }
                  struct.rolePrivilegesMap.put(_key141, _val142);
                }
                iprot.readMapEnd();
              }
              struct.setRolePrivilegesMapIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TSentryMappingData struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.groupRolesMap != null) {
        if (struct.isSetGroupRolesMap()) {
          oprot.writeFieldBegin(GROUP_ROLES_MAP_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.SET, struct.groupRolesMap.size()));
            for (Map.Entry<String, Set<String>> _iter146 : struct.groupRolesMap.entrySet())
            {
              oprot.writeString(_iter146.getKey());
              {
                oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRING, _iter146.getValue().size()));
                for (String _iter147 : _iter146.getValue())
                {
                  oprot.writeString(_iter147);
                }
                oprot.writeSetEnd();
              }
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.rolePrivilegesMap != null) {
        if (struct.isSetRolePrivilegesMap()) {
          oprot.writeFieldBegin(ROLE_PRIVILEGES_MAP_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.SET, struct.rolePrivilegesMap.size()));
            for (Map.Entry<String, Set<TSentryPrivilege>> _iter148 : struct.rolePrivilegesMap.entrySet())
            {
              oprot.writeString(_iter148.getKey());
              {
                oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRUCT, _iter148.getValue().size()));
                for (TSentryPrivilege _iter149 : _iter148.getValue())
                {
                  _iter149.write(oprot);
                }
                oprot.writeSetEnd();
              }
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TSentryMappingDataTupleSchemeFactory implements SchemeFactory {
    public TSentryMappingDataTupleScheme getScheme() {
      return new TSentryMappingDataTupleScheme();
    }
  }

  private static class TSentryMappingDataTupleScheme extends TupleScheme<TSentryMappingData> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TSentryMappingData struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetGroupRolesMap()) {
        optionals.set(0);
      }
      if (struct.isSetRolePrivilegesMap()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetGroupRolesMap()) {
        {
          oprot.writeI32(struct.groupRolesMap.size());
          for (Map.Entry<String, Set<String>> _iter150 : struct.groupRolesMap.entrySet())
          {
            oprot.writeString(_iter150.getKey());
            {
              oprot.writeI32(_iter150.getValue().size());
              for (String _iter151 : _iter150.getValue())
              {
                oprot.writeString(_iter151);
              }
            }
          }
        }
      }
      if (struct.isSetRolePrivilegesMap()) {
        {
          oprot.writeI32(struct.rolePrivilegesMap.size());
          for (Map.Entry<String, Set<TSentryPrivilege>> _iter152 : struct.rolePrivilegesMap.entrySet())
          {
            oprot.writeString(_iter152.getKey());
            {
              oprot.writeI32(_iter152.getValue().size());
              for (TSentryPrivilege _iter153 : _iter152.getValue())
              {
                _iter153.write(oprot);
              }
            }
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TSentryMappingData struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TMap _map154 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.SET, iprot.readI32());
          struct.groupRolesMap = new HashMap<String,Set<String>>(2*_map154.size);
          for (int _i155 = 0; _i155 < _map154.size; ++_i155)
          {
            String _key156; // required
            Set<String> _val157; // required
            _key156 = iprot.readString();
            {
              org.apache.thrift.protocol.TSet _set158 = new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
              _val157 = new HashSet<String>(2*_set158.size);
              for (int _i159 = 0; _i159 < _set158.size; ++_i159)
              {
                String _elem160; // required
                _elem160 = iprot.readString();
                _val157.add(_elem160);
              }
            }
            struct.groupRolesMap.put(_key156, _val157);
          }
        }
        struct.setGroupRolesMapIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TMap _map161 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.SET, iprot.readI32());
          struct.rolePrivilegesMap = new HashMap<String,Set<TSentryPrivilege>>(2*_map161.size);
          for (int _i162 = 0; _i162 < _map161.size; ++_i162)
          {
            String _key163; // required
            Set<TSentryPrivilege> _val164; // required
            _key163 = iprot.readString();
            {
              org.apache.thrift.protocol.TSet _set165 = new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
              _val164 = new HashSet<TSentryPrivilege>(2*_set165.size);
              for (int _i166 = 0; _i166 < _set165.size; ++_i166)
              {
                TSentryPrivilege _elem167; // required
                _elem167 = new TSentryPrivilege();
                _elem167.read(iprot);
                _val164.add(_elem167);
              }
            }
            struct.rolePrivilegesMap.put(_key163, _val164);
          }
        }
        struct.setRolePrivilegesMapIsSet(true);
      }
    }
  }

}
