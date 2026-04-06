package org.bson.codecs.configuration;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.bson.codecs.Codec;

final class MapOfCodecsProvider implements CodecProvider {

    /* renamed from: a  reason: collision with root package name */
    public final Map f43755a = new HashMap();

    public MapOfCodecsProvider(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Codec codec = (Codec) it.next();
            this.f43755a.put(codec.d(), codec);
        }
    }

    public Codec b(Class cls, CodecRegistry codecRegistry) {
        return (Codec) this.f43755a.get(cls);
    }
}
