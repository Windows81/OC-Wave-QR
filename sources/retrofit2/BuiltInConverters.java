package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.Unit;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.http.Streaming;

final class BuiltInConverters extends Converter.Factory {

    public static final class BufferingResponseBodyConverter implements Converter<ResponseBody, ResponseBody> {

        /* renamed from: a  reason: collision with root package name */
        public static final BufferingResponseBodyConverter f44118a = new BufferingResponseBodyConverter();

        /* renamed from: b */
        public ResponseBody a(ResponseBody responseBody) {
            try {
                return Utils.a(responseBody);
            } finally {
                responseBody.close();
            }
        }
    }

    public static final class RequestBodyConverter implements Converter<RequestBody, RequestBody> {

        /* renamed from: a  reason: collision with root package name */
        public static final RequestBodyConverter f44119a = new RequestBodyConverter();

        /* renamed from: b */
        public RequestBody a(RequestBody requestBody) {
            return requestBody;
        }
    }

    public static final class StreamingResponseBodyConverter implements Converter<ResponseBody, ResponseBody> {

        /* renamed from: a  reason: collision with root package name */
        public static final StreamingResponseBodyConverter f44120a = new StreamingResponseBodyConverter();

        /* renamed from: b */
        public ResponseBody a(ResponseBody responseBody) {
            return responseBody;
        }
    }

    public static final class ToStringConverter implements Converter<Object, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final ToStringConverter f44121a = new ToStringConverter();

        /* renamed from: b */
        public String a(Object obj) {
            return obj.toString();
        }
    }

    public static final class UnitResponseBodyConverter implements Converter<ResponseBody, Unit> {

        /* renamed from: a  reason: collision with root package name */
        public static final UnitResponseBodyConverter f44122a = new UnitResponseBodyConverter();

        /* renamed from: b */
        public Unit a(ResponseBody responseBody) {
            responseBody.close();
            return Unit.f40552a;
        }
    }

    public static final class VoidResponseBodyConverter implements Converter<ResponseBody, Void> {

        /* renamed from: a  reason: collision with root package name */
        public static final VoidResponseBodyConverter f44123a = new VoidResponseBodyConverter();

        /* renamed from: b */
        public Void a(ResponseBody responseBody) {
            responseBody.close();
            return null;
        }
    }

    public Converter c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        if (RequestBody.class.isAssignableFrom(Utils.h(type))) {
            return RequestBodyConverter.f44119a;
        }
        return null;
    }

    public Converter d(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (type == ResponseBody.class) {
            return Utils.l(annotationArr, Streaming.class) ? StreamingResponseBodyConverter.f44120a : BufferingResponseBodyConverter.f44118a;
        }
        if (type == Void.class) {
            return VoidResponseBodyConverter.f44123a;
        }
        if (Utils.m(type)) {
            return UnitResponseBodyConverter.f44122a;
        }
        return null;
    }
}
