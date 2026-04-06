package org.bson.codecs;

import org.bson.UuidRepresentation;

public interface OverridableUuidRepresentationCodec<T> {
    Codec c(UuidRepresentation uuidRepresentation);
}
