package android.example.hongkongguide;

import android.content.Context;

import java.util.List;

public class Hotels {
    public static void initHotelsList(List<Location> list, Context context) {


        list.add( new Location(
                context.getString( R.string.hotel_ibis_name ),
                context.getString( R.string.hotel_ibis_description ),
                context.getString( R.string.hotel_ibis_address ),
                context.getString( R.string.hotel_ibis_phone ),
                context.getString( R.string.hotel_ibis_schedule ),
                context.getString( R.string.food_price_two ),
                R.drawable.hotels_ibis
        ) );

        list.add( new Location(
                context.getString( R.string.hotel_akvo_name ),
                context.getString( R.string.hotel_akvo_description ),
                context.getString( R.string.hotel_akvo_address ),
                context.getString( R.string.hotel_akvo_phone ),
                context.getString( R.string.hotel_akvo_schedule ),
                context.getString( R.string.food_price_two ),
                R.drawable.hotels_akvo
        ) );

        list.add( new Location(
                context.getString( R.string.hotel_mojo_name ),
                context.getString( R.string.hotel_mojo_description ),
                context.getString( R.string.hotel_mojo_address ),
                context.getString( R.string.hotel_mojo_phone ),
                context.getString( R.string.hotel_mojo_schedule ),
                context.getString( R.string.food_price_two ),
                R.drawable.hotels_mojo
        ) );

        list.add( new Location(
                context.getString( R.string.hotel_holiday_name ),
                context.getString( R.string.hotel_holiday_description ),
                context.getString( R.string.hotel_holiday_address ),
                context.getString( R.string.hotel_holiday_phone ),
                context.getString( R.string.hotel_holiday_schedule ),
                context.getString( R.string.food_price_four ),
                R.drawable.hotels_holiday
        ) );

        list.add( new Location(
                context.getString( R.string.hotel_jervois_name ),
                context.getString( R.string.hotel_jervois_description ),
                context.getString( R.string.hotel_jervois_address ),
                context.getString( R.string.hotel_jervois_phone ),
                context.getString( R.string.hotel_jervois_schedule ),
                context.getString( R.string.food_price_one ),
                R.drawable.hotels_jervois
        ) );

        list.add( new Location(
                context.getString( R.string.hotel_butterfly_name ),
                context.getString( R.string.hotel_butterfly_description ),
                context.getString( R.string.hotel_butterfly_address ),
                context.getString( R.string.hotel_butterfly_phone ),
                context.getString( R.string.hotel_butterfly_schedule ),
                context.getString( R.string.food_price_one ),
                R.drawable.hotels_butterfly
        ) );

        list.add( new Location(
                context.getString( R.string.hotel_iclub_name ),
                context.getString( R.string.hotel_iclub_description ),
                context.getString( R.string.hotel_iclub_address ),
                context.getString( R.string.hotel_iclub_phone ),
                context.getString( R.string.hotel_iclub_schedule ),
                context.getString( R.string.food_price_one ),
                R.drawable.hotels_iclub
        ) );
    }

}
