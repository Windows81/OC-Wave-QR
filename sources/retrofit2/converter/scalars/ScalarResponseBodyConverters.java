package retrofit2.converter.scalars;

import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Converter;

final class ScalarResponseBodyConverters {

    public static final class BooleanResponseBodyConverter implements Converter<ResponseBody, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final BooleanResponseBodyConverter f44328a = new BooleanResponseBodyConverter();

        /* renamed from: b */
        public Boolean a(ResponseBody responseBody) {
            return Boolean.valueOf(responseBody.k());
        }
    }

    public static final class ByteResponseBodyConverter implements Converter<ResponseBody, Byte> {

        /* renamed from: a  reason: collision with root package name */
        public static final ByteResponseBodyConverter f44329a = new ByteResponseBodyConverter();

        /* renamed from: b */
        public Byte a(ResponseBody responseBody) {
            return Byte.valueOf(responseBody.k());
        }
    }

    public static final class CharacterResponseBodyConverter implements Converter<ResponseBody, Character> {

        /* renamed from: a  reason: collision with root package name */
        public static final CharacterResponseBodyConverter f44330a = new CharacterResponseBodyConverter();

        /* renamed from: b */
        public Character a(ResponseBody responseBody) {
            String k2 = responseBody.k();
            if (k2.length() == 1) {
                return Character.valueOf(k2.charAt(0));
            }
            throw new IOException("Expected body of length 1 for Character conversion but was " + k2.length());
        }
    }

    public static final class DoubleResponseBodyConverter implements Converter<ResponseBody, Double> {

        /* renamed from: a  reason: collision with root package name */
        public static final DoubleResponseBodyConverter f44331a = new DoubleResponseBodyConverter();

        /* renamed from: b */
        public Double a(ResponseBody responseBody) {
            return Double.valueOf(responseBody.k());
        }
    }

    public static final class FloatResponseBodyConverter implements Converter<ResponseBody, Float> {

        /* renamed from: a  reason: collision with root package name */
        public static final FloatResponseBodyConverter f44332a = new FloatResponseBodyConverter();

        /* renamed from: b */
        public Float a(ResponseBody responseBody) {
            return Float.valueOf(responseBody.k());
        }
    }

    public static final class IntegerResponseBodyConverter implements Converter<ResponseBody, Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final IntegerResponseBodyConverter f44333a = new IntegerResponseBodyConverter();

        /* renamed from: b */
        public Integer a(ResponseBody responseBody) {
            return Integer.valueOf(responseBody.k());
        }
    }

    public static final class LongResponseBodyConverter implements Converter<ResponseBody, Long> {

        /* renamed from: a  reason: collision with root package name */
        public static final LongResponseBodyConverter f44334a = new LongResponseBodyConverter();

        /* renamed from: b */
        public Long a(ResponseBody responseBody) {
            return Long.valueOf(responseBody.k());
        }
    }

    public static final class ShortResponseBodyConverter implements Converter<ResponseBody, Short> {

        /* renamed from: a  reason: collision with root package name */
        public static final ShortResponseBodyConverter f44335a = new ShortResponseBodyConverter();

        /* renamed from: b */
        public Short a(ResponseBody responseBody) {
            return Short.valueOf(responseBody.k());
        }
    }

    public static final class StringResponseBodyConverter implements Converter<ResponseBody, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final StringResponseBodyConverter f44336a = new StringResponseBodyConverter();

        /* renamed from: b */
        public String a(ResponseBody responseBody) {
            return responseBody.k();
        }
    }
}
