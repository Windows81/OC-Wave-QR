package kotlin.collections;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.UByteArray;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShortArray;
import kotlin.collections.unsigned.UArraysKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata
class ArraysKt__ArraysKt extends ArraysKt__ArraysJVMKt {
    public static boolean c(Object[] objArr, Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        if (objArr == null || objArr2 == null || objArr.length != objArr2.length) {
            return false;
        }
        int length = objArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            Object[] objArr3 = objArr[i2];
            Object[] objArr4 = objArr2[i2];
            if (objArr3 != objArr4) {
                if (objArr3 == null || objArr4 == null) {
                    return false;
                }
                if (!(objArr3 instanceof Object[]) || !(objArr4 instanceof Object[])) {
                    if (!(objArr3 instanceof byte[]) || !(objArr4 instanceof byte[])) {
                        if (!(objArr3 instanceof short[]) || !(objArr4 instanceof short[])) {
                            if (!(objArr3 instanceof int[]) || !(objArr4 instanceof int[])) {
                                if (!(objArr3 instanceof long[]) || !(objArr4 instanceof long[])) {
                                    if (!(objArr3 instanceof float[]) || !(objArr4 instanceof float[])) {
                                        if (!(objArr3 instanceof double[]) || !(objArr4 instanceof double[])) {
                                            if (!(objArr3 instanceof char[]) || !(objArr4 instanceof char[])) {
                                                if (!(objArr3 instanceof boolean[]) || !(objArr4 instanceof boolean[])) {
                                                    if (!(objArr3 instanceof UByteArray) || !(objArr4 instanceof UByteArray)) {
                                                        if (!(objArr3 instanceof UShortArray) || !(objArr4 instanceof UShortArray)) {
                                                            if (!(objArr3 instanceof UIntArray) || !(objArr4 instanceof UIntArray)) {
                                                                if (!(objArr3 instanceof ULongArray) || !(objArr4 instanceof ULongArray)) {
                                                                    if (!Intrinsics.d(objArr3, objArr4)) {
                                                                        return false;
                                                                    }
                                                                } else if (!UArraysKt.d(((ULongArray) objArr3).B(), ((ULongArray) objArr4).B())) {
                                                                    return false;
                                                                }
                                                            } else if (!UArraysKt.b(((UIntArray) objArr3).B(), ((UIntArray) objArr4).B())) {
                                                                return false;
                                                            }
                                                        } else if (!UArraysKt.a(((UShortArray) objArr3).B(), ((UShortArray) objArr4).B())) {
                                                            return false;
                                                        }
                                                    } else if (!UArraysKt.c(((UByteArray) objArr3).B(), ((UByteArray) objArr4).B())) {
                                                        return false;
                                                    }
                                                } else if (!Arrays.equals((boolean[]) objArr3, (boolean[]) objArr4)) {
                                                    return false;
                                                }
                                            } else if (!Arrays.equals((char[]) objArr3, (char[]) objArr4)) {
                                                return false;
                                            }
                                        } else if (!Arrays.equals((double[]) objArr3, (double[]) objArr4)) {
                                            return false;
                                        }
                                    } else if (!Arrays.equals((float[]) objArr3, (float[]) objArr4)) {
                                        return false;
                                    }
                                } else if (!Arrays.equals((long[]) objArr3, (long[]) objArr4)) {
                                    return false;
                                }
                            } else if (!Arrays.equals((int[]) objArr3, (int[]) objArr4)) {
                                return false;
                            }
                        } else if (!Arrays.equals((short[]) objArr3, (short[]) objArr4)) {
                            return false;
                        }
                    } else if (!Arrays.equals((byte[]) objArr3, (byte[]) objArr4)) {
                        return false;
                    }
                } else if (!ArraysKt.c(objArr3, objArr4)) {
                    return false;
                }
            }
        }
        return true;
    }
}
