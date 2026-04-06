package androidx.cursoradapter.widget;

import android.database.Cursor;
import android.widget.Filter;

class CursorFilter extends Filter {

    /* renamed from: a  reason: collision with root package name */
    public CursorFilterClient f20478a;

    public interface CursorFilterClient {
        CharSequence a(Cursor cursor);

        void b(Cursor cursor);

        Cursor c();

        Cursor d(CharSequence charSequence);
    }

    public CursorFilter(CursorFilterClient cursorFilterClient) {
        this.f20478a = cursorFilterClient;
    }

    public CharSequence convertResultToString(Object obj) {
        return this.f20478a.a((Cursor) obj);
    }

    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor d2 = this.f20478a.d(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (d2 != null) {
            filterResults.count = d2.getCount();
            filterResults.values = d2;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor c2 = this.f20478a.c();
        Object obj = filterResults.values;
        if (obj != null && obj != c2) {
            this.f20478a.b((Cursor) obj);
        }
    }
}
