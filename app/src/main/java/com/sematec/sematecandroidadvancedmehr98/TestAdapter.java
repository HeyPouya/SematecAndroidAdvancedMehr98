package com.sematec.sematecandroidadvancedmehr98;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TestAdapter extends RecyclerView.Adapter<TestAdapter.TestViewHolder> {


    @NonNull
    @Override
    public TestViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item, parent, false);
        return new TestViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull TestViewHolder holder, int position) {

        switch (position) {
            case 0:
                holder.onBind("Qoli", "Qolizade");
                break;
            case 1:
                holder.onBind("Ali", "Alipour");
                break;
            case 2:
                holder.onBind("Mamad", "Mamadnezhad");
                break;
            case 3:
                holder.onBind("Sakine", "SakineKhah");
                break;
            case 4:
                holder.onBind("Sudabe", "Sudabee");
                break;
        }
    }

    @Override
    public int getItemCount() {
        return 5;
    }

    class TestViewHolder extends RecyclerView.ViewHolder {

        TextView text1;
        View v;

        public TestViewHolder(@NonNull final View itemView) {
            super(itemView);
            text1 = itemView.findViewById(R.id.text1);
            v = itemView;

        }

        void onBind(String name, final String family) {

            text1.setText(name);

            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(v.getContext(), family, Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
