package com.ws.Base;

import java.util.LinkedList;
import java.util.List;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public abstract class BaseTemplateAdapter<T> extends BaseAdapter {
    protected Context context;

    public BaseTemplateAdapter(Context context) {
        this.context = context;
    }

    private final List<T> mList = new LinkedList<T>();



    public List<T> getList() {
        return mList;
    }

    public void appendToList(List<T> list) {
        if (list == null) {
            return;
        }
        mList.addAll(list);
        notifyDataSetChanged();
    }

    public void appendToTopList(List<T> list) {
        if (list == null) {
            return;
        }
        mList.addAll(0, list);
        notifyDataSetChanged();
    }

    public void appendToTop(T t) {
        if (t == null) {
            return;
        }
        mList.add(0, t);
        notifyDataSetChanged();
    }

    public void appendToBottom(T t) {
        if (t == null) {
            return;
        }
        mList.add(t);
        notifyDataSetChanged();
    }

    public void remvoe(T t) {
        if (t == null) {
            return;
        }
        mList.remove(t);
        notifyDataSetChanged();
    }

    public void clear() {
        mList.clear();
        notifyDataSetChanged();
    }

//	private void appendAndReplace(T t, Comparator<T> comparator) {
//		if (t == null) {
//			return;
//		}
//		int size = mList.size();
//		boolean find = false;
//		for (int i = 0; i < size; i++) {
//			T temp = mList.get(i);
//			if (comparator.compare(temp, t) == 0) {
//				mList.add(i, t);
//				mList.remove(temp);
//				find = true;
//				break;
//			}
//		}
//		if (!find) {
//			mList.add(t);
//		}
//	}

//	public void appendAndReplace(List<T> list, Comparator<T> comparator) {
//		for (int i = 0; i < list.size(); i++) {
//			T t = list.get(i);
//			appendAndReplace(t, comparator);
//		}
//		notifyDataSetChanged();
//	}

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public T getItem(int position) {
        if (position > mList.size() - 1) {
            return null;
        }
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (position == getCount() - 1) {
            onReachBottom();
        }
        return getExView(position, convertView, parent);
    }

    protected abstract View getExView(int position, View convertView,
                                      ViewGroup parent);

    protected abstract void onReachBottom();

    protected View inflate(int rid) {
        View view = View.inflate(context, rid, null);
        return view;
    }

}
