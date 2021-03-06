/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.mokey.acupple.dashcam.common.models.thrift;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;
import org.apache.thrift.scheme.TupleScheme;

import javax.annotation.Generated;
import java.util.*;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2016-3-8")
public class Result implements org.apache.thrift.TBase<Result, Result._Fields>, java.io.Serializable, Cloneable, Comparable<Result> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Result");

  private static final org.apache.thrift.protocol.TField RESULT_CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("resultCode", org.apache.thrift.protocol.TType.I32, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ResultStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ResultTupleSchemeFactory());
  }

  /**
   * 
   * @see ResultCode
   */
  public ResultCode resultCode; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     *
     * @see ResultCode
     */
    RESULT_CODE((short)1, "resultCode");

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
        case 1: // RESULT_CODE
          return RESULT_CODE;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.RESULT_CODE, new org.apache.thrift.meta_data.FieldMetaData("resultCode", org.apache.thrift.TFieldRequirementType.REQUIRED,
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, ResultCode.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Result.class, metaDataMap);
  }

  public Result() {
  }

  public Result(
    ResultCode resultCode)
  {
    this();
    this.resultCode = resultCode;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Result(Result other) {
    if (other.isSetResultCode()) {
      this.resultCode = other.resultCode;
    }
  }

  public Result deepCopy() {
    return new Result(this);
  }

  @Override
  public void clear() {
    this.resultCode = null;
  }

  /**
   *
   * @see ResultCode
   */
  public ResultCode getResultCode() {
    return this.resultCode;
  }

  /**
   *
   * @see ResultCode
   */
  public Result setResultCode(ResultCode resultCode) {
    this.resultCode = resultCode;
    return this;
  }

  public void unsetResultCode() {
    this.resultCode = null;
  }

  /** Returns true if field resultCode is set (has been assigned a value) and false otherwise */
  public boolean isSetResultCode() {
    return this.resultCode != null;
  }

  public void setResultCodeIsSet(boolean value) {
    if (!value) {
      this.resultCode = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case RESULT_CODE:
      if (value == null) {
        unsetResultCode();
      } else {
        setResultCode((ResultCode)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case RESULT_CODE:
      return getResultCode();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case RESULT_CODE:
      return isSetResultCode();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Result)
      return this.equals((Result)that);
    return false;
  }

  public boolean equals(Result that) {
    if (that == null)
      return false;

    boolean this_present_resultCode = true && this.isSetResultCode();
    boolean that_present_resultCode = true && that.isSetResultCode();
    if (this_present_resultCode || that_present_resultCode) {
      if (!(this_present_resultCode && that_present_resultCode))
        return false;
      if (!this.resultCode.equals(that.resultCode))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_resultCode = true && (isSetResultCode());
    list.add(present_resultCode);
    if (present_resultCode)
      list.add(resultCode.getValue());

    return list.hashCode();
  }

  @Override
  public int compareTo(Result other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetResultCode()).compareTo(other.isSetResultCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResultCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.resultCode, other.resultCode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Result(");
    boolean first = true;

    sb.append("resultCode:");
    if (this.resultCode == null) {
      sb.append("null");
    } else {
      sb.append(this.resultCode);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    if (resultCode == null) {
      throw new TProtocolException("Required field 'resultCode' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ResultStandardSchemeFactory implements SchemeFactory {
    public ResultStandardScheme getScheme() {
      return new ResultStandardScheme();
    }
  }

  private static class ResultStandardScheme extends StandardScheme<Result> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Result struct) throws TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
          break;
        }
        switch (schemeField.id) {
          case 1: // RESULT_CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.resultCode = ResultCode.findByValue(iprot.readI32());
              struct.setResultCodeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Result struct) throws TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.resultCode != null) {
        oprot.writeFieldBegin(RESULT_CODE_FIELD_DESC);
        oprot.writeI32(struct.resultCode.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ResultTupleSchemeFactory implements SchemeFactory {
    public ResultTupleScheme getScheme() {
      return new ResultTupleScheme();
    }
  }

  private static class ResultTupleScheme extends TupleScheme<Result> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Result struct) throws TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.resultCode.getValue());
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Result struct) throws TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.resultCode = ResultCode.findByValue(iprot.readI32());
      struct.setResultCodeIsSet(true);
    }
  }

}

