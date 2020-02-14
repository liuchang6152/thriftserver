/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.liuchang.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2020-02-14")
public class PersonOrg implements org.apache.thrift.TBase<PersonOrg, PersonOrg._Fields>, java.io.Serializable, Cloneable, Comparable<PersonOrg> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("PersonOrg");

  private static final org.apache.thrift.protocol.TField ORG_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("orgName", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField ORG_CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("orgCode", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField ORG_LEVEL_FIELD_DESC = new org.apache.thrift.protocol.TField("orgLevel", org.apache.thrift.protocol.TType.I32, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new PersonOrgStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new PersonOrgTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String orgName; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String orgCode; // optional
  public int orgLevel; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ORG_NAME((short)1, "orgName"),
    ORG_CODE((short)2, "orgCode"),
    ORG_LEVEL((short)3, "orgLevel");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ORG_NAME
          return ORG_NAME;
        case 2: // ORG_CODE
          return ORG_CODE;
        case 3: // ORG_LEVEL
          return ORG_LEVEL;
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
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __ORGLEVEL_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.ORG_NAME,_Fields.ORG_CODE,_Fields.ORG_LEVEL};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ORG_NAME, new org.apache.thrift.meta_data.FieldMetaData("orgName", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "String")));
    tmpMap.put(_Fields.ORG_CODE, new org.apache.thrift.meta_data.FieldMetaData("orgCode", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "String")));
    tmpMap.put(_Fields.ORG_LEVEL, new org.apache.thrift.meta_data.FieldMetaData("orgLevel", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "int")));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(PersonOrg.class, metaDataMap);
  }

  public PersonOrg() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PersonOrg(PersonOrg other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetOrgName()) {
      this.orgName = other.orgName;
    }
    if (other.isSetOrgCode()) {
      this.orgCode = other.orgCode;
    }
    this.orgLevel = other.orgLevel;
  }

  public PersonOrg deepCopy() {
    return new PersonOrg(this);
  }

  @Override
  public void clear() {
    this.orgName = null;
    this.orgCode = null;
    setOrgLevelIsSet(false);
    this.orgLevel = 0;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getOrgName() {
    return this.orgName;
  }

  public PersonOrg setOrgName(@org.apache.thrift.annotation.Nullable java.lang.String orgName) {
    this.orgName = orgName;
    return this;
  }

  public void unsetOrgName() {
    this.orgName = null;
  }

  /** Returns true if field orgName is set (has been assigned a value) and false otherwise */
  public boolean isSetOrgName() {
    return this.orgName != null;
  }

  public void setOrgNameIsSet(boolean value) {
    if (!value) {
      this.orgName = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getOrgCode() {
    return this.orgCode;
  }

  public PersonOrg setOrgCode(@org.apache.thrift.annotation.Nullable java.lang.String orgCode) {
    this.orgCode = orgCode;
    return this;
  }

  public void unsetOrgCode() {
    this.orgCode = null;
  }

  /** Returns true if field orgCode is set (has been assigned a value) and false otherwise */
  public boolean isSetOrgCode() {
    return this.orgCode != null;
  }

  public void setOrgCodeIsSet(boolean value) {
    if (!value) {
      this.orgCode = null;
    }
  }

  public int getOrgLevel() {
    return this.orgLevel;
  }

  public PersonOrg setOrgLevel(int orgLevel) {
    this.orgLevel = orgLevel;
    setOrgLevelIsSet(true);
    return this;
  }

  public void unsetOrgLevel() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ORGLEVEL_ISSET_ID);
  }

  /** Returns true if field orgLevel is set (has been assigned a value) and false otherwise */
  public boolean isSetOrgLevel() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ORGLEVEL_ISSET_ID);
  }

  public void setOrgLevelIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ORGLEVEL_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case ORG_NAME:
      if (value == null) {
        unsetOrgName();
      } else {
        setOrgName((java.lang.String)value);
      }
      break;

    case ORG_CODE:
      if (value == null) {
        unsetOrgCode();
      } else {
        setOrgCode((java.lang.String)value);
      }
      break;

    case ORG_LEVEL:
      if (value == null) {
        unsetOrgLevel();
      } else {
        setOrgLevel((java.lang.Integer)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ORG_NAME:
      return getOrgName();

    case ORG_CODE:
      return getOrgCode();

    case ORG_LEVEL:
      return getOrgLevel();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case ORG_NAME:
      return isSetOrgName();
    case ORG_CODE:
      return isSetOrgCode();
    case ORG_LEVEL:
      return isSetOrgLevel();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof PersonOrg)
      return this.equals((PersonOrg)that);
    return false;
  }

  public boolean equals(PersonOrg that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_orgName = true && this.isSetOrgName();
    boolean that_present_orgName = true && that.isSetOrgName();
    if (this_present_orgName || that_present_orgName) {
      if (!(this_present_orgName && that_present_orgName))
        return false;
      if (!this.orgName.equals(that.orgName))
        return false;
    }

    boolean this_present_orgCode = true && this.isSetOrgCode();
    boolean that_present_orgCode = true && that.isSetOrgCode();
    if (this_present_orgCode || that_present_orgCode) {
      if (!(this_present_orgCode && that_present_orgCode))
        return false;
      if (!this.orgCode.equals(that.orgCode))
        return false;
    }

    boolean this_present_orgLevel = true && this.isSetOrgLevel();
    boolean that_present_orgLevel = true && that.isSetOrgLevel();
    if (this_present_orgLevel || that_present_orgLevel) {
      if (!(this_present_orgLevel && that_present_orgLevel))
        return false;
      if (this.orgLevel != that.orgLevel)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetOrgName()) ? 131071 : 524287);
    if (isSetOrgName())
      hashCode = hashCode * 8191 + orgName.hashCode();

    hashCode = hashCode * 8191 + ((isSetOrgCode()) ? 131071 : 524287);
    if (isSetOrgCode())
      hashCode = hashCode * 8191 + orgCode.hashCode();

    hashCode = hashCode * 8191 + ((isSetOrgLevel()) ? 131071 : 524287);
    if (isSetOrgLevel())
      hashCode = hashCode * 8191 + orgLevel;

    return hashCode;
  }

  @Override
  public int compareTo(PersonOrg other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetOrgName()).compareTo(other.isSetOrgName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOrgName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.orgName, other.orgName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetOrgCode()).compareTo(other.isSetOrgCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOrgCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.orgCode, other.orgCode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetOrgLevel()).compareTo(other.isSetOrgLevel());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOrgLevel()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.orgLevel, other.orgLevel);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("PersonOrg(");
    boolean first = true;

    if (isSetOrgName()) {
      sb.append("orgName:");
      if (this.orgName == null) {
        sb.append("null");
      } else {
        sb.append(this.orgName);
      }
      first = false;
    }
    if (isSetOrgCode()) {
      if (!first) sb.append(", ");
      sb.append("orgCode:");
      if (this.orgCode == null) {
        sb.append("null");
      } else {
        sb.append(this.orgCode);
      }
      first = false;
    }
    if (isSetOrgLevel()) {
      if (!first) sb.append(", ");
      sb.append("orgLevel:");
      sb.append(this.orgLevel);
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

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class PersonOrgStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public PersonOrgStandardScheme getScheme() {
      return new PersonOrgStandardScheme();
    }
  }

  private static class PersonOrgStandardScheme extends org.apache.thrift.scheme.StandardScheme<PersonOrg> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, PersonOrg struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ORG_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.orgName = iprot.readString();
              struct.setOrgNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ORG_CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.orgCode = iprot.readString();
              struct.setOrgCodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ORG_LEVEL
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.orgLevel = iprot.readI32();
              struct.setOrgLevelIsSet(true);
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

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, PersonOrg struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.orgName != null) {
        if (struct.isSetOrgName()) {
          oprot.writeFieldBegin(ORG_NAME_FIELD_DESC);
          oprot.writeString(struct.orgName);
          oprot.writeFieldEnd();
        }
      }
      if (struct.orgCode != null) {
        if (struct.isSetOrgCode()) {
          oprot.writeFieldBegin(ORG_CODE_FIELD_DESC);
          oprot.writeString(struct.orgCode);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetOrgLevel()) {
        oprot.writeFieldBegin(ORG_LEVEL_FIELD_DESC);
        oprot.writeI32(struct.orgLevel);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PersonOrgTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public PersonOrgTupleScheme getScheme() {
      return new PersonOrgTupleScheme();
    }
  }

  private static class PersonOrgTupleScheme extends org.apache.thrift.scheme.TupleScheme<PersonOrg> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, PersonOrg struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetOrgName()) {
        optionals.set(0);
      }
      if (struct.isSetOrgCode()) {
        optionals.set(1);
      }
      if (struct.isSetOrgLevel()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetOrgName()) {
        oprot.writeString(struct.orgName);
      }
      if (struct.isSetOrgCode()) {
        oprot.writeString(struct.orgCode);
      }
      if (struct.isSetOrgLevel()) {
        oprot.writeI32(struct.orgLevel);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, PersonOrg struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.orgName = iprot.readString();
        struct.setOrgNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.orgCode = iprot.readString();
        struct.setOrgCodeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.orgLevel = iprot.readI32();
        struct.setOrgLevelIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

