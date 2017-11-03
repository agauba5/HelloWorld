package edu.cnm.bootcamp.gauba.helloworld.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import edu.cnm.bootcamp.gauba.helloworld.R;
import edu.cnm.bootcamp.gauba.helloworld.api.models.Image;
import java.util.List;

public class ImageListAdapter extends BaseAdapter {

  private Context context;
  private List<Image> images;

  public ImageListAdapter(Context context, List<Image> images){
    this.context = context;
    this.images = images;
  }
  @Override
  public int getCount() {
    return (images !=null) ? images.size() : 0;
  }

  @Override
  public Object getItem(int position) {
    return (images !=null && position < images.size())
        ? images.get(position)
        :null;
  }

  @Override
  public long getItemId(int i) {
    return 0;
  }

  @Override
  public View getView(int position, View convertView, ViewGroup parent) {
    if(convertView == null){
      LayoutInflater.from(context)
                    .inflate(R.layout.image_list_item,
                    parent, false);
    }
    Object item = getItem(position);
    if(item != null){
      Image image = (Image) item;
      TextView txtTitle = (TextView)convertView.findViewById(R.id.txtTitle);
      TextView txtDescription = (TextView)convertView.findViewById(R.id.txtDescription);
      txtTitle.setText(image.getTitle());
      txtDescription.setText(image.getDescriptin());

    }
    return convertView;
  }
}
