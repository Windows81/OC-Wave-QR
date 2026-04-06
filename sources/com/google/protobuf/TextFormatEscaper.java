package com.google.protobuf;

final class TextFormatEscaper {

    /* renamed from: com.google.protobuf.TextFormatEscaper$2  reason: invalid class name */
    class AnonymousClass2 implements ByteSequence {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ byte[] f32318a;

        public byte a(int i2) {
            return this.f32318a[i2];
        }

        public int size() {
            return this.f32318a.length;
        }
    }

    public interface ByteSequence {
        byte a(int i2);

        int size();
    }

    public static String a(final ByteString byteString) {
        return b(new ByteSequence() {
            public byte a(int i2) {
                return ByteString.this.i(i2);
            }

            public int size() {
                return ByteString.this.size();
            }
        });
    }

    public static String b(ByteSequence byteSequence) {
        StringBuilder sb = new StringBuilder(byteSequence.size());
        for (int i2 = 0; i2 < byteSequence.size(); i2++) {
            byte a2 = byteSequence.a(i2);
            if (a2 == 34) {
                sb.append("\\\"");
            } else if (a2 == 39) {
                sb.append("\\'");
            } else if (a2 != 92) {
                switch (a2) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (a2 >= 32 && a2 <= 126) {
                            sb.append((char) a2);
                            break;
                        } else {
                            sb.append('\\');
                            sb.append((char) (((a2 >>> 6) & 3) + 48));
                            sb.append((char) (((a2 >>> 3) & 7) + 48));
                            sb.append((char) ((a2 & 7) + 48));
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static String c(String str) {
        return a(ByteString.u(str));
    }
}
