package bilal.khelifi.touhami.alternativemedicine;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RecAdapter extends RecyclerView.Adapter<RecAdapter.RecViewHolder> {

    private List<MyListItem> list;

    public RecAdapter(List<MyListItem> list) {
        this.list = list;
    }

    @Override
    public RecViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.item_layout, parent, false);
        return new RecViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecViewHolder holder, int position) {
        MyListItem item = list.get(position);

        holder.bind(item);

        holder.itemView.setOnClickListener(v -> {
            //  boolean expanded = item.isExpanded();
            //item.setExpanded(!expanded);
            //notifyItemChanged(position);

            Intent myIntent = new Intent(holder.context, ContentActivity.class);
            myIntent.putExtra("content", item.getContent());
            myIntent.putExtra("title", item.getTitle());
            myIntent.putExtra("img", item.getImg());
            holder.context.startActivity(myIntent);
        });
    }

    @Override
    public int getItemCount() {
        return list == null ? 0 : list.size();
    }

    public class RecViewHolder extends RecyclerView.ViewHolder {

        private final Context context;
        private TextView title;
        private TextView content;
        private View subItem;

        public RecViewHolder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.item_title);
          //  content = itemView.findViewById(R.id.sub_item_content);
          //  subItem = itemView.findViewById(R.id.sub_item);
            this.context = itemView.getContext();
        }

        private void bind(MyListItem item) {
            // boolean expanded = item.isExpanded();
            //subItem.setVisibility(expanded ? View.VISIBLE : View.GONE);
            title.setText(item.getTitle());
            //  content.setText(item.getContent());
        }

        public TextView getContent() {
            return content;
        }

        public void setContent(TextView content) {
            this.content = content;
        }
    }
}