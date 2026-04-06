package org.bson.codecs.pojo;

import java.util.ArrayList;
import java.util.List;
import org.bson.codecs.Codec;
import org.bson.codecs.configuration.CodecRegistry;

class PropertyCodecRegistryImpl implements PropertyCodecRegistry {

    /* renamed from: a  reason: collision with root package name */
    public final List f43838a;

    public PropertyCodecRegistryImpl(PojoCodec pojoCodec, CodecRegistry codecRegistry, List list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            arrayList.addAll(list);
        }
        arrayList.add(new CollectionPropertyCodecProvider());
        arrayList.add(new MapPropertyCodecProvider());
        arrayList.add(new EnumPropertyCodecProvider(codecRegistry));
        arrayList.add(new FallbackPropertyCodecProvider(pojoCodec, codecRegistry));
        this.f43838a = arrayList;
    }

    public Codec a(TypeWithTypeParameters typeWithTypeParameters) {
        for (PropertyCodecProvider a2 : this.f43838a) {
            Codec a3 = a2.a(typeWithTypeParameters, this);
            if (a3 != null) {
                return a3;
            }
        }
        return null;
    }
}
