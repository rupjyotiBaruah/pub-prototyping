/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package root;

public class SomeStruct {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public SomeStruct(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(SomeStruct obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        JnitestCJNI.delete_SomeStruct(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setALong(int value) {
    JnitestCJNI.SomeStruct_aLong_set(swigCPtr, this, value);
  }

  public int getALong() {
    return JnitestCJNI.SomeStruct_aLong_get(swigCPtr, this);
  }

  public void setAString(String value) {
    JnitestCJNI.SomeStruct_aString_set(swigCPtr, this, value);
  }

  public String getAString() {
    return JnitestCJNI.SomeStruct_aString_get(swigCPtr, this);
  }

  public void setADouble(double value) {
    JnitestCJNI.SomeStruct_aDouble_set(swigCPtr, this, value);
  }

  public double getADouble() {
    return JnitestCJNI.SomeStruct_aDouble_get(swigCPtr, this);
  }

  public SomeStruct() {
    this(JnitestCJNI.new_SomeStruct(), true);
  }

}