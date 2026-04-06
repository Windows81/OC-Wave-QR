package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

@ElementTypesAreNonnullByDefault
final class SortedLists {

    public enum KeyAbsentBehavior {
        NEXT_LOWER {
            public int f(int i2) {
                return i2 - 1;
            }
        },
        NEXT_HIGHER {
            public int f(int i2) {
                return i2;
            }
        },
        INVERTED_INSERTION_INDEX {
            public int f(int i2) {
                return ~i2;
            }
        };

        public abstract int f(int i2);
    }

    public enum KeyPresentBehavior {
        ANY_PRESENT {
            public int f(Comparator comparator, Object obj, List list, int i2) {
                return i2;
            }
        },
        LAST_PRESENT {
            public int f(Comparator comparator, Object obj, List list, int i2) {
                int size = list.size() - 1;
                while (i2 < size) {
                    int i3 = ((i2 + size) + 1) >>> 1;
                    if (comparator.compare(list.get(i3), obj) > 0) {
                        size = i3 - 1;
                    } else {
                        i2 = i3;
                    }
                }
                return i2;
            }
        },
        FIRST_PRESENT {
            public int f(Comparator comparator, Object obj, List list, int i2) {
                int i3 = 0;
                while (i3 < i2) {
                    int i4 = (i3 + i2) >>> 1;
                    if (comparator.compare(list.get(i4), obj) < 0) {
                        i3 = i4 + 1;
                    } else {
                        i2 = i4;
                    }
                }
                return i3;
            }
        },
        FIRST_AFTER {
            public int f(Comparator comparator, Object obj, List list, int i2) {
                return KeyPresentBehavior.LAST_PRESENT.f(comparator, obj, list, i2) + 1;
            }
        },
        LAST_BEFORE {
            public int f(Comparator comparator, Object obj, List list, int i2) {
                return KeyPresentBehavior.FIRST_PRESENT.f(comparator, obj, list, i2) - 1;
            }
        };

        public abstract int f(Comparator comparator, Object obj, List list, int i2);
    }

    public static int a(List list, Function function, Comparable comparable, KeyPresentBehavior keyPresentBehavior, KeyAbsentBehavior keyAbsentBehavior) {
        Preconditions.q(comparable);
        return b(list, function, comparable, Ordering.e(), keyPresentBehavior, keyAbsentBehavior);
    }

    public static int b(List list, Function function, Object obj, Comparator comparator, KeyPresentBehavior keyPresentBehavior, KeyAbsentBehavior keyAbsentBehavior) {
        return c(Lists.n(list, function), obj, comparator, keyPresentBehavior, keyAbsentBehavior);
    }

    public static int c(List list, Object obj, Comparator comparator, KeyPresentBehavior keyPresentBehavior, KeyAbsentBehavior keyAbsentBehavior) {
        Preconditions.q(comparator);
        Preconditions.q(list);
        Preconditions.q(keyPresentBehavior);
        Preconditions.q(keyAbsentBehavior);
        if (!(list instanceof RandomAccess)) {
            list = Lists.i(list);
        }
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int compare = comparator.compare(obj, list.get(i3));
            if (compare < 0) {
                size = i3 - 1;
            } else if (compare <= 0) {
                return i2 + keyPresentBehavior.f(comparator, obj, list.subList(i2, size + 1), i3 - i2);
            } else {
                i2 = i3 + 1;
            }
        }
        return keyAbsentBehavior.f(i2);
    }
}
