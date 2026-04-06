package com.google.gson;

import com.google.gson.stream.JsonReader;

public interface ToNumberStrategy {
    Number d(JsonReader jsonReader);
}
