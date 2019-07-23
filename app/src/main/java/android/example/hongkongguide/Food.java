package android.example.hongkongguide;

import android.content.Context;


import java.util.List;

public class Food {

    public static void initFoodsList(List<Location> list, Context context) {

        list.add( new Location(
                context.getString( R.string.food_duddell_name ),
                context.getString( R.string.food_duddell_description ),
                context.getString( R.string.food_duddell_address ),
                context.getString( R.string.food_duddell_phone ),
                context.getString( R.string.food_duddell_schedule ),
                context.getString( R.string.food_price_two ),
                R.drawable.food_duddell
        ) );

        list.add( new Location(
                context.getString( R.string.food_kam_name ),
                context.getString( R.string.food_kam_description ),
                context.getString( R.string.food_kam_address ),
                context.getString( R.string.food_kam_phone ),
                context.getString( R.string.food_kam_schedule ),
                context.getString( R.string.food_price_two ),
                R.drawable.food_kam
        ) );

        list.add( new Location(
                context.getString( R.string.food_timhowan_name ),
                context.getString( R.string.food_timhowan_description ),
                context.getString( R.string.food_timhowan_address ),
                context.getString( R.string.food_timhowan_phone ),
                context.getString( R.string.food_timhowan_schedule ),
                context.getString( R.string.food_price_two ),
                R.drawable.food_timhowan
        ) );

        list.add( new Location(
                context.getString( R.string.food_ecriture_name ),
                context.getString( R.string.food_ecriture_description ),
                context.getString( R.string.food_ecriture_address ),
                context.getString( R.string.food_ecriture_phone ),
                context.getString( R.string.food_ecriture_schedule ),
                context.getString( R.string.food_price_four ),
                R.drawable.food_ecriture
        ) );

        list.add( new Location(
                context.getString( R.string.food_arcane_name ),
                context.getString( R.string.food_arcane_description ),
                context.getString( R.string.food_arcane_address ),
                context.getString( R.string.food_arcane_phone ),
                context.getString( R.string.food_arcane_schedule ),
                context.getString( R.string.food_price_one ),
                R.drawable.food_arcane
        ) );

        list.add( new Location(
                context.getString( R.string.food_caprice_name ),
                context.getString( R.string.food_caprice_description ),
                context.getString( R.string.food_caprice_address ),
                context.getString( R.string.food_caprice_phone ),
                context.getString( R.string.food_caprice_schedule ),
                context.getString( R.string.food_price_one ),
                R.drawable.food_caprice
        ) );

        list.add( new Location(
                context.getString( R.string.food_shikon_name ),
                context.getString( R.string.food_shikon_description ),
                context.getString( R.string.food_shikon_address ),
                context.getString( R.string.food_shikon_phone ),
                context.getString( R.string.food_shikon_schedule ),
                context.getString( R.string.food_price_one ),
                R.drawable.food_shikon
        ) );
    }


}
