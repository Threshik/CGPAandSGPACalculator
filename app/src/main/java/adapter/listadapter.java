package adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.cgpacalculator.R;

import java.util.List;

import model.product;

public class listadapter extends BaseAdapter {
    private Context myContext;
    private List<product> myProductlist;

    public listadapter(Context myContext, List<product> myProductlist) {
        this.myContext = myContext;
        this.myProductlist = myProductlist;
    }

    @Override
    public int getCount() {
        return myProductlist.size();
    }

    @Override
    public Object getItem(int position) {
        return myProductlist.get(position);
    }

    @Override
    public long getItemId(int position) {
        return myProductlist.get(position).getSem();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = View.inflate(myContext, R.layout.item,null);
        TextView t1 = view.findViewById(R.id.tv_product_name);
        TextView t2 = view.findViewById(R.id.tv_product_description);
        t1.setText(myProductlist.get(position).getCourse());
        t2.setText(myProductlist.get(position).getCredits());
        return view;
    }
}
