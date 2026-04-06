package org.bson.json;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

class ShellDateTimeConverter implements Converter<Long> {
    /* renamed from: b */
    public void a(Long l2, StrictJsonWriter strictJsonWriter) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        if (l2.longValue() < -59014396800000L || l2.longValue() > 253399536000000L) {
            strictJsonWriter.c(String.format("new Date(%d)", new Object[]{l2}));
        } else {
            strictJsonWriter.c(String.format("ISODate(\"%s\")", new Object[]{simpleDateFormat.format(new Date(l2.longValue()))}));
        }
    }
}
