package com.ws.AdapterView;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.ws.GreenDao.Paragraph;
import com.ws.GreenDao.SupervisionstandardParagraph;
import com.ws.ChinaIndustryStandard.R;

import org.androidannotations.annotations.EViewGroup;
import org.androidannotations.annotations.ViewById;

/**
 * Created by SoulShan on 2017/10/20.
 */
@EViewGroup(R.layout.item_paragraph)
public class ParagraphItemView extends LinearLayout {
    @ViewById
    TextView tv_paragraph;

    public ParagraphItemView(Context context) {
        super(context);
    }

    public void bind(SupervisionstandardParagraph supervisionstandardParagraph) {
        try {
            tv_paragraph.setText(supervisionstandardParagraph.getChapterid() + "." + supervisionstandardParagraph.getPartid() + "." + supervisionstandardParagraph.getParagraph());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void bind(Paragraph paragraph) {
        try {
            tv_paragraph.setText(paragraph.getChapterid() + "." + paragraph.getPartid() + "." + paragraph.getParagraphid() + paragraph.getParagraph());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
