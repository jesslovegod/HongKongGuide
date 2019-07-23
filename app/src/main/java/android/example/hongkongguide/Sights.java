package android.example.hongkongguide;

import android.content.Context;

import java.util.List;

public class Sights {

    public static void initSightsList(List<Location> list, Context context) {


        list.add( new Location(
                context.getString( R.string.sight_buddha_name ),
                context.getString( R.string.sight_buddha_description ),
                context.getString( R.string.sight_buddha_address ),
                context.getString( R.string.sight_buddha_phone ),
                context.getString( R.string.sight_buddha_schedule ),
                context.getString( R.string.sight_price_free ),
                R.drawable.sights_buddhas
        ) );

        list.add( new Location(
                context.getString( R.string.sight_miufat_name ),
                context.getString( R.string.sight_miufat_description ),
                context.getString( R.string.sight_miufat_address ),
                context.getString( R.string.sight_miufat_phone ),
                context.getString( R.string.sight_miufat_schedule ),
                context.getString( R.string.sight_miufat_price ),
                R.drawable.sights_miufat
        ) );


        list.add( new Location(
                context.getString( R.string.sight_disneyland_name ),
                context.getString( R.string.sight_disneyland_description ),
                context.getString( R.string.sight_disneyland_address ),
                context.getString( R.string.sight_disneyland_phone ),
                context.getString( R.string.sight_disneyland_schedule ),
                context.getString( R.string.sight_price_free ),
                R.drawable.sights_disneyland
        ) );

        list.add( new Location(
                context.getString( R.string.sight_art_name ),
                context.getString( R.string.sight_art_description ),
                context.getString( R.string.sight_art_address ),
                context.getString( R.string.sight_art_phone ),
                context.getString( R.string.sight_art_schedule ),
                context.getString( R.string.sight_price_free ),
                R.drawable.sights_tang_art
        ) );

        list.add( new Location(
                context.getString( R.string.sight_malingue_name ),
                context.getString( R.string.sight_malingue_description ),
                context.getString( R.string.sight_malingue_address ),
                context.getString( R.string.sight_malingue_phone ),
                context.getString( R.string.sight_malingue_schedule ),
                context.getString( R.string.sight_price_free ),
                R.drawable.sights_malingue
        ) );

        list.add( new Location(
                context.getString( R.string.sight_museum_name ),
                context.getString( R.string.sight_museum_description ),
                context.getString( R.string.sight_museum_address ),
                context.getString( R.string.sight_museum_phone ),
                context.getString( R.string.sight_museum_schedule ),
                context.getString( R.string.sight_price_free ),
                R.drawable.sights_museum
        ) );

        list.add( new Location(
                context.getString( R.string.sight_lanbuddha_name ),
                context.getString( R.string.sight_lanbuddha_description ),
                context.getString( R.string.sight_lanbuddha_address ),
                context.getString( R.string.sight_lanbuddha_phone ),
                context.getString( R.string.sight_lanbuddha_schedule ),
                context.getString( R.string.sight_price_free ),
                R.drawable.sights_lanbuddha
        ) );
    }
}
