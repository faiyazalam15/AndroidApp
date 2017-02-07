package com.alamatcs.faiyaz.lostandfind;
import android.app.ListActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import java.util.List;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
/**
 * Created by Faiyaz on 2/4/2017.
 */
public class SearchActivity extends ListActivity {
    private RequestQueue rq;
    LostFind lostFind = null;
    String[] str =new String[5];
    List<LostFindBean> lostFindBeansList;
    boolean[] listImages={true, true};

    //private String url="http://date.jsontest.com/";
    private String url="http://zouple.com/lostfind/services/item.php?flag=L";
    public void onCreate(Bundle savedInstanceState) {
        String[] listItems={"alpha", "beta", "gamma", "delta", "epsilon"};
        lostFindBeansList = new ArrayList<LostFindBean>();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_layout);
        rq= VolleySingleton.getInstance(this).getRequestQueue();
        Request<JSONObject> qstepbuilder = rq.add(new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try {
                   //Toast.makeText(getApplicationContext(), response.getString("time"), Toast.LENGTH_LONG).show();
                    JSONObject json = response;
                    LostFindBean lostFindBean = null;
                    lostFind.setStatus(setNullToEmpty(json.getString("status")));
                    lostFind.setStatus(setNullToEmpty(json.getString("message")));
                    if (!setNullToEmpty(json.getString("status")).isEmpty()
                            && json.getString("status").equals("success")) {
                        JSONArray jsonArray = json.getJSONArray("item");
                        for (int i = 0; i < jsonArray.length(); i++) {

                            json = (JSONObject) jsonArray.get(i);
                            lostFindBean = new LostFindBean();
                            lostFindBean.setName(setNullToEmpty(json
                                    .getString("name")));
                            lostFindBean
                                    .setId(setNullToEmpty(json.getString("id")));
                            lostFindBean.setDescription(setNullToEmpty(json
                                    .getString("description")));
                            lostFindBean.setClour(setNullToEmpty(json
                                    .getString("clour")));
                            lostFindBean.setBrand(setNullToEmpty(json
                                    .getString("brand")));
                            lostFindBean.setCashamount(setNullToEmpty(json
                                    .getString("cashamount")));
                            lostFindBean.setWroth(setNullToEmpty(json
                                    .getString("wroth")));
                            lostFindBean.setPlace(setNullToEmpty(json
                                    .getString("place")));
                            lostFindBean.setContact_name(setNullToEmpty(json
                                    .getString("contact_name")));
                            lostFindBean.setContact_no(setNullToEmpty(json
                                    .getString("contact_no")));
                            lostFindBean.setContact_email(setNullToEmpty(json
                                    .getString("contact_email")));
                            lostFindBean.setContact_city(setNullToEmpty(json
                                    .getString("contact_city")));
                            lostFindBean.setType(setNullToEmpty(json
                                    .getString("type")));
                            lostFindBean.setName(setNullToEmpty(json
                                    .getString("name")));

                            lostFindBeansList.add(lostFindBean);
                          //  Toast.makeText(getApplicationContext(), lostFindBeansList.toString(), Toast.LENGTH_LONG).show();
                        }
                        showJSON(lostFindBeansList);

                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
            }
        }));
       // Toast.makeText(getApplicationContext(), "Faiyaz", Toast.LENGTH_LONG).show();

       // Toast.makeText(getApplicationContext(), lostFindBeansList.toString(), Toast.LENGTH_LONG).show();
        setListAdapter(new ImageAdapter(this, R.layout.search_layout, R.id.text1, R.id.image1,lostFindBeansList , listImages ));
    }

    public void showJSON(List<LostFindBean> json){
        setListAdapter(new ImageAdapter(this, R.layout.search_layout, R.id.text1, R.id.image1,json , listImages ));
    }
    public static String setNullToEmpty(String value) {
        return (value == null ? "" : value.trim());
    }

    public void onListItemClick(ListView parent, View v,
                                int position, long id) {
    }
}
