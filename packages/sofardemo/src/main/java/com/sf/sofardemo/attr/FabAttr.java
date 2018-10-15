package com.sf.sofardemo.attr;

import android.content.res.ColorStateList;
import android.support.design.widget.FloatingActionButton;
import android.view.View;

import com.sf.libskin.attr.base.SkinAttr;
import com.sf.libskin.config.SkinConfig;
import com.sf.libskin.loader.SkinManager;

/**
 * Created by sufan on 17/7/5.
 */

public class FabAttr extends SkinAttr {
    @Override
    public void apply(View view) {
        if (view instanceof FloatingActionButton) {
            FloatingActionButton fab = (FloatingActionButton) view;
            if (RES_TYPE_NAME_COLOR.equals(attrValueTypeName)) {
                int color = SkinManager.getInstance().getColor(attrValueRefId);
                if (SkinConfig.isSPColor) {
                    color = SkinManager.getInstance().getSPColor(attrValueRefId);
                }
                fab.setBackgroundTintList(ColorStateList.valueOf(color));
            }
        }
    }
}
