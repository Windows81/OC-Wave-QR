package org.bson.json;

class ShellInt64Converter implements Converter<Long> {
    /* renamed from: b */
    public void a(Long l2, StrictJsonWriter strictJsonWriter) {
        if (l2.longValue() < -2147483648L || l2.longValue() > 2147483647L) {
            strictJsonWriter.c(String.format("NumberLong(\"%d\")", new Object[]{l2}));
        } else {
            strictJsonWriter.c(String.format("NumberLong(%d)", new Object[]{l2}));
        }
    }
}
