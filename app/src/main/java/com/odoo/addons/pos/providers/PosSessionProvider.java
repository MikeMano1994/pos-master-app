package com.odoo.addons.pos.providers;

import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;

import com.odoo.addons.pos.models.PosSession;
import com.odoo.addons.pos.models.PosSessionOpening;
import com.odoo.core.orm.ODataRow;
import com.odoo.core.orm.OModel;
import com.odoo.core.orm.fields.OColumn;
import com.odoo.core.orm.provider.BaseModelProvider;
import com.odoo.core.support.OdooFields;

import java.util.ArrayList;
import java.util.List;

import odoo.helper.ODomain;

/**
 * Created by My on 7/22/2015.
 */
public class PosSessionProvider extends BaseModelProvider {
    public static final String TAG = PosSessionProvider.class.getSimpleName();

    @Override
    public String authority() {
        return PosSession.AUTHORITY;
    }
//
//    @Override
//    public void setModel(Uri uri) {
//        super.setModel(uri);
//        mModel = new PosSession(getContext(), getUser(uri));
//    }

//    @Override
//    public Cursor query(Uri uri, String[] base_projection, String selection, String[] selectionArgs, String sortOrder) {
//
//        PosSessionOpening session = new PosSessionOpening(getContext(), null);
//        Cursor cr = super.query(session.uri(), base_projection, selection, selectionArgs, sortOrder);
//        if (cr.getCount() <= 0) {
//            String searchName = null;
//            if (selectionArgs != null && selectionArgs.length > 0) {
//                searchName = selectionArgs[selectionArgs.length - 1];
//            }
//            if (searchName != null) {
//                List<ODataRow> records = getRecords(searchName, session);
//                if (records.size() > 0) {
//                    List<String> keys = new ArrayList<>();
//                    keys.addAll(records.get(0).keys());
//                    keys.add(OColumn.ROW_ID);
//                    MatrixCursor cursor = new MatrixCursor(keys.toArray(new String[keys.size()]));
//                    for (ODataRow row : records) {
//                        List<Object> values = row.values();
//                        values.add(0);
//                        cursor.addRow(values);
//                    }
//                    return cursor;
//                }
//            }
//        }
//        return cr;
//    }

//    public List<ODataRow> getRecords(String searchName, OModel model) {
//        List<ODataRow> items = new ArrayList<>();
//        try {
//            OdooFields fields = new OdooFields(new String[]{"name", "state", "user_id"});
//            ODomain domain = new ODomain();
//            domain.add("state", "=like", "%" + searchName + "%");
//            List<ODataRow> records = model.getServerDataHelper().searchRecords(fields, domain, 10);
//            items.addAll(records);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return items;
//    }
}