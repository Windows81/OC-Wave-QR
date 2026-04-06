package org.bson.codecs;

import java.util.UUID;
import org.bson.UuidRepresentation;

public class OverridableUuidRepresentationUuidCodec extends UuidCodec implements OverridableUuidRepresentationCodec<UUID> {
    public OverridableUuidRepresentationUuidCodec() {
    }

    public Codec c(UuidRepresentation uuidRepresentation) {
        return new OverridableUuidRepresentationUuidCodec(uuidRepresentation);
    }

    public OverridableUuidRepresentationUuidCodec(UuidRepresentation uuidRepresentation) {
        super(uuidRepresentation);
    }
}
