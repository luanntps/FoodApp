package com.example.baemin.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

/*import com.example.baemin.Adapter.CartAdapter;*/
import com.example.baemin.Interfaces.IClick_Item;
import com.example.baemin.R;

import java.util.ArrayList;
import java.util.List;

public class CartActivity extends AppCompatActivity {

  /*  RecyclerView rvCart;
    CartAdapter adapterCart;*/

/*    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        rvCart = findViewById(R.id.cart_rv);
        adapterCart = new CartAdapter();
        LinearLayoutManager LLM = new LinearLayoutManager(this);
        rvCart.setLayoutManager(LLM);
        adapterCart.loadAdapter(getListCart(), iClick());
        rvCart.setAdapter(adapterCart);
    }


    private List<FoodModel> getListCart() {
        List<FoodModel> rawFoodModel = new ArrayList<>();
rawFoodModel.add(new FoodModel("Bánh gạo số 1", 100, 2, R.drawable.fo1));
        rawFoodModel.add(new FoodModel("Buổi trưa số 2", 200, 3, R.drawable.fo1));
        rawFoodModel.add(new FoodModel("Ramen số 3", 300, 4, R.drawable.fo1));
        rawFoodModel.add(new FoodModel("Canh Hàn Quôc 4", 400, 5, R.drawable.fo1));
        rawFoodModel.add(new FoodModel("Gà rán không xương phô mai 5", 500, 6, R.drawable.fo1));
        rawFoodModel.add(new FoodModel("Bánh gạo số 1", 100, 2, R.drawable.fo1));
        rawFoodModel.add(new FoodModel("Buổi trưa số 2", 200, 3, R.drawable.fo1));
        rawFoodModel.add(new FoodModel("Ramen số 3", 300, 4, R.drawable.fo1));
        rawFoodModel.add(new FoodModel("Canh Hàn Quôc 4", 400, 5, R.drawable.fo1));
        rawFoodModel.add(new FoodModel("Gà rán không xương phô mai 5", 500, 6, R.drawable.fo1));


        return rawFoodModel;
    }

    private IClick_Item iClick() {
        return new IClick_Item() {
            @Override
            public void onClickCartItem(FoodModel foodModel) {
                Intent i = new Intent(CartActivity.this, DetailActivity.class);
                Bundle b = new Bundle();
                b.putSerializable("my_food", foodModel);
                i.putExtras(b);
                startActivity(i);
            }
        };*/
    /*}*/

}
