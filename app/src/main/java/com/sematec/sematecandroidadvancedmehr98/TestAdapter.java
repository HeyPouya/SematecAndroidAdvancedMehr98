package com.sematec.sematecandroidadvancedmehr98;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TestAdapter extends RecyclerView.Adapter<TestAdapter.TestViewHolder> {

    private List<String> list;
    private ClickInterface listener;

    public TestAdapter(List<String> list, ClickInterface listener) {
        this.list = list;
        this.listener = listener;


    }

    @NonNull
    @Override
    public TestViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item, parent, false);
        return new TestViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull TestViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class TestViewHolder extends RecyclerView.ViewHolder {

        TextView text1;
        View v;

        public TestViewHolder(@NonNull final View itemView) {
            super(itemView);
            text1 = itemView.findViewById(R.id.text1);
            v = itemView;
        }

        void onBind(final String model) {
            text1.setText(model);

            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onRecyclerItemClicked(model);
                }
            });
        }
    }
}
