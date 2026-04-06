package retrofit2;

public interface Callback<T> {
    void onFailure(Call call, Throwable th);

    void onResponse(Call call, Response response);
}
