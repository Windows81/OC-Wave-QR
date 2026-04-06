package androidx.versionedparcelable;

import android.os.Parcelable;
import androidx.collection.ArrayMap;
import androidx.versionedparcelable.VersionedParcel;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

class VersionedParcelStream extends VersionedParcel {

    /* renamed from: m  reason: collision with root package name */
    public static final Charset f23049m = Charset.forName("UTF-16");

    /* renamed from: d  reason: collision with root package name */
    public final DataInputStream f23050d;

    /* renamed from: e  reason: collision with root package name */
    public final DataOutputStream f23051e;

    /* renamed from: f  reason: collision with root package name */
    public DataInputStream f23052f;

    /* renamed from: g  reason: collision with root package name */
    public DataOutputStream f23053g;

    /* renamed from: h  reason: collision with root package name */
    public FieldBuffer f23054h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f23055i;

    /* renamed from: j  reason: collision with root package name */
    public int f23056j = 0;

    /* renamed from: k  reason: collision with root package name */
    public int f23057k = -1;

    /* renamed from: l  reason: collision with root package name */
    public int f23058l = -1;

    public static class FieldBuffer {

        /* renamed from: a  reason: collision with root package name */
        public final ByteArrayOutputStream f23060a;

        /* renamed from: b  reason: collision with root package name */
        public final DataOutputStream f23061b;

        /* renamed from: c  reason: collision with root package name */
        public final int f23062c;

        /* renamed from: d  reason: collision with root package name */
        public final DataOutputStream f23063d;

        public FieldBuffer(int i2, DataOutputStream dataOutputStream) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            this.f23060a = byteArrayOutputStream;
            this.f23061b = new DataOutputStream(byteArrayOutputStream);
            this.f23062c = i2;
            this.f23063d = dataOutputStream;
        }

        public void a() {
            this.f23061b.flush();
            int size = this.f23060a.size();
            this.f23063d.writeInt((this.f23062c << 16) | (size >= 65535 ? 65535 : size));
            if (size >= 65535) {
                this.f23063d.writeInt(size);
            }
            this.f23060a.writeTo(this.f23063d);
        }
    }

    public VersionedParcelStream(InputStream inputStream, OutputStream outputStream, ArrayMap arrayMap, ArrayMap arrayMap2, ArrayMap arrayMap3) {
        super(arrayMap, arrayMap2, arrayMap3);
        DataOutputStream dataOutputStream = null;
        DataInputStream dataInputStream = inputStream != null ? new DataInputStream(new FilterInputStream(inputStream) {
            public int read() {
                VersionedParcelStream versionedParcelStream = VersionedParcelStream.this;
                int i2 = versionedParcelStream.f23058l;
                if (i2 == -1 || versionedParcelStream.f23056j < i2) {
                    int read = super.read();
                    VersionedParcelStream.this.f23056j++;
                    return read;
                }
                throw new IOException();
            }

            public long skip(long j2) {
                VersionedParcelStream versionedParcelStream = VersionedParcelStream.this;
                int i2 = versionedParcelStream.f23058l;
                if (i2 == -1 || versionedParcelStream.f23056j < i2) {
                    long skip = super.skip(j2);
                    if (skip > 0) {
                        VersionedParcelStream.this.f23056j += (int) skip;
                    }
                    return skip;
                }
                throw new IOException();
            }

            public int read(byte[] bArr, int i2, int i3) {
                VersionedParcelStream versionedParcelStream = VersionedParcelStream.this;
                int i4 = versionedParcelStream.f23058l;
                if (i4 == -1 || versionedParcelStream.f23056j < i4) {
                    int read = super.read(bArr, i2, i3);
                    if (read > 0) {
                        VersionedParcelStream.this.f23056j += read;
                    }
                    return read;
                }
                throw new IOException();
            }
        }) : null;
        this.f23050d = dataInputStream;
        dataOutputStream = outputStream != null ? new DataOutputStream(outputStream) : dataOutputStream;
        this.f23051e = dataOutputStream;
        this.f23052f = dataInputStream;
        this.f23053g = dataOutputStream;
    }

    public void A(byte[] bArr) {
        if (bArr != null) {
            try {
                this.f23053g.writeInt(bArr.length);
                this.f23053g.write(bArr);
            } catch (IOException e2) {
                throw new VersionedParcel.ParcelException(e2);
            }
        } else {
            this.f23053g.writeInt(-1);
        }
    }

    public void C(CharSequence charSequence) {
        if (!this.f23055i) {
            throw new RuntimeException("CharSequence cannot be written to an OutputStream");
        }
    }

    public void E(int i2) {
        try {
            this.f23053g.writeInt(i2);
        } catch (IOException e2) {
            throw new VersionedParcel.ParcelException(e2);
        }
    }

    public void G(Parcelable parcelable) {
        if (!this.f23055i) {
            throw new RuntimeException("Parcelables cannot be written to an OutputStream");
        }
    }

    public void I(String str) {
        if (str != null) {
            try {
                byte[] bytes = str.getBytes(f23049m);
                this.f23053g.writeInt(bytes.length);
                this.f23053g.write(bytes);
            } catch (IOException e2) {
                throw new VersionedParcel.ParcelException(e2);
            }
        } else {
            this.f23053g.writeInt(-1);
        }
    }

    public void a() {
        FieldBuffer fieldBuffer = this.f23054h;
        if (fieldBuffer != null) {
            try {
                if (fieldBuffer.f23060a.size() != 0) {
                    this.f23054h.a();
                }
                this.f23054h = null;
            } catch (IOException e2) {
                throw new VersionedParcel.ParcelException(e2);
            }
        }
    }

    public VersionedParcel b() {
        return new VersionedParcelStream(this.f23052f, this.f23053g, this.f23038a, this.f23039b, this.f23040c);
    }

    public boolean f() {
        return true;
    }

    public boolean g() {
        try {
            return this.f23052f.readBoolean();
        } catch (IOException e2) {
            throw new VersionedParcel.ParcelException(e2);
        }
    }

    public byte[] i() {
        try {
            int readInt = this.f23052f.readInt();
            if (readInt <= 0) {
                return null;
            }
            byte[] bArr = new byte[readInt];
            this.f23052f.readFully(bArr);
            return bArr;
        } catch (IOException e2) {
            throw new VersionedParcel.ParcelException(e2);
        }
    }

    public CharSequence k() {
        return null;
    }

    public boolean m(int i2) {
        while (true) {
            try {
                int i3 = this.f23057k;
                if (i3 == i2) {
                    return true;
                }
                if (String.valueOf(i3).compareTo(String.valueOf(i2)) > 0) {
                    return false;
                }
                int i4 = this.f23056j;
                int i5 = this.f23058l;
                if (i4 < i5) {
                    this.f23050d.skip((long) (i5 - i4));
                }
                this.f23058l = -1;
                int readInt = this.f23050d.readInt();
                this.f23056j = 0;
                int i6 = readInt & 65535;
                if (i6 == 65535) {
                    i6 = this.f23050d.readInt();
                }
                this.f23057k = (readInt >> 16) & 65535;
                this.f23058l = i6;
            } catch (IOException unused) {
                return false;
            }
        }
    }

    public int o() {
        try {
            return this.f23052f.readInt();
        } catch (IOException e2) {
            throw new VersionedParcel.ParcelException(e2);
        }
    }

    public Parcelable q() {
        return null;
    }

    public String s() {
        try {
            int readInt = this.f23052f.readInt();
            if (readInt <= 0) {
                return null;
            }
            byte[] bArr = new byte[readInt];
            this.f23052f.readFully(bArr);
            return new String(bArr, f23049m);
        } catch (IOException e2) {
            throw new VersionedParcel.ParcelException(e2);
        }
    }

    public void w(int i2) {
        a();
        FieldBuffer fieldBuffer = new FieldBuffer(i2, this.f23051e);
        this.f23054h = fieldBuffer;
        this.f23053g = fieldBuffer.f23061b;
    }

    public void x(boolean z2, boolean z3) {
        if (z2) {
            this.f23055i = z3;
            return;
        }
        throw new RuntimeException("Serialization of this object is not allowed");
    }

    public void y(boolean z2) {
        try {
            this.f23053g.writeBoolean(z2);
        } catch (IOException e2) {
            throw new VersionedParcel.ParcelException(e2);
        }
    }
}
