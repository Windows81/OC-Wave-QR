package okhttp3;

import java.io.IOException;
import kotlin.Metadata;

@Metadata
public interface Callback {
    void b(Call call, Response response);

    void c(Call call, IOException iOException);
}
