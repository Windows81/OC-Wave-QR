package coil.intercept;

import coil.request.ImageRequest;
import coil.size.Size;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata
public interface Interceptor {

    @Metadata
    public interface Chain {
        ImageRequest a();

        Size e();
    }

    Object a(Chain chain, Continuation continuation);
}
