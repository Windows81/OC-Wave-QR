package com.google.firebase.encoders.json;

import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.ValueEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

public final class JsonDataEncoderBuilder implements EncoderConfig<JsonDataEncoderBuilder> {

    /* renamed from: e  reason: collision with root package name */
    public static final ObjectEncoder f30702e = new a();

    /* renamed from: f  reason: collision with root package name */
    public static final ValueEncoder f30703f = new b();

    /* renamed from: g  reason: collision with root package name */
    public static final ValueEncoder f30704g = new c();

    /* renamed from: h  reason: collision with root package name */
    public static final TimestampEncoder f30705h = new TimestampEncoder();

    /* renamed from: a  reason: collision with root package name */
    public final Map f30706a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Map f30707b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public ObjectEncoder f30708c = f30702e;

    /* renamed from: d  reason: collision with root package name */
    public boolean f30709d = false;

    public static final class TimestampEncoder implements ValueEncoder<Date> {

        /* renamed from: a  reason: collision with root package name */
        public static final DateFormat f30711a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f30711a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        public TimestampEncoder() {
        }

        /* renamed from: b */
        public void a(Date date, ValueEncoderContext valueEncoderContext) {
            valueEncoderContext.e(f30711a.format(date));
        }
    }

    public JsonDataEncoderBuilder() {
        p(String.class, f30703f);
        p(Boolean.class, f30704g);
        p(Date.class, f30705h);
    }

    public static /* synthetic */ void l(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    public DataEncoder i() {
        return new DataEncoder() {
            public void a(Object obj, Writer writer) {
                JsonValueObjectEncoderContext jsonValueObjectEncoderContext = new JsonValueObjectEncoderContext(writer, JsonDataEncoderBuilder.this.f30706a, JsonDataEncoderBuilder.this.f30707b, JsonDataEncoderBuilder.this.f30708c, JsonDataEncoderBuilder.this.f30709d);
                jsonValueObjectEncoderContext.k(obj, false);
                jsonValueObjectEncoderContext.u();
            }

            public String b(Object obj) {
                StringWriter stringWriter = new StringWriter();
                try {
                    a(obj, stringWriter);
                } catch (IOException unused) {
                }
                return stringWriter.toString();
            }
        };
    }

    public JsonDataEncoderBuilder j(Configurator configurator) {
        configurator.a(this);
        return this;
    }

    public JsonDataEncoderBuilder k(boolean z2) {
        this.f30709d = z2;
        return this;
    }

    /* renamed from: o */
    public JsonDataEncoderBuilder a(Class cls, ObjectEncoder objectEncoder) {
        this.f30706a.put(cls, objectEncoder);
        this.f30707b.remove(cls);
        return this;
    }

    public JsonDataEncoderBuilder p(Class cls, ValueEncoder valueEncoder) {
        this.f30707b.put(cls, valueEncoder);
        this.f30706a.remove(cls);
        return this;
    }
}
