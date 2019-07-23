package android.example.hongkongguide;

import android.content.Context;

import java.util.List;

public class Shops {

    public static void initShopsList(List<Location> list, Context context) {

        list.add( new Location(
                context.getString( R.string.shop_lab_name ),
                context.getString( R.string.shop_lab_description ),
                context.getString( R.string.shop_lab_address ),
                context.getString( R.string.shop_lab_phone ),
                context.getString( R.string.shop_lab_schedule ),
                null,
                R.drawable.shops_lab
        ) );

        list.add( new Location(
                context.getString( R.string.shop_logon_name ),
                context.getString( R.string.shop_logon_description ),
                context.getString( R.string.shop_logon_address ),
                context.getString( R.string.shop_logon_phone ),
                context.getString( R.string.shop_logon_schedule ),
                null,
                R.drawable.shops_logon
        ) );

        list.add( new Location(
                context.getString( R.string.shop_sogo_name ),
                context.getString( R.string.shop_sogo_description ),
                context.getString( R.string.shop_sogo_address ),
                context.getString( R.string.shop_sogo_phone ),
                context.getString( R.string.shop_sogo_schedule ),
                null,
                R.drawable.shops_sogo
        ) );

        list.add( new Location(
                context.getString( R.string.shop_lanecrawford_name ),
                context.getString( R.string.shop_lanecrawford_description ),
                context.getString( R.string.shop_lanecrawford_address ),
                context.getString( R.string.shop_lanecrawford_phone ),
                context.getString( R.string.shop_lanecrawford_schedule ),
                null,
                R.drawable.shops_lanecrawford
        ) );

        list.add( new Location(
                context.getString( R.string.shop_brows_name ),
                context.getString( R.string.shop_brows_description ),
                context.getString( R.string.shop_brows_address ),
                context.getString( R.string.shop_brows_phone ),
                context.getString( R.string.shop_brows_schedule ),
                null,
                R.drawable.shops_brows
        ) );

        list.add( new Location(
                context.getString( R.string.shop_flow_name ),
                context.getString( R.string.shop_flow_description ),
                context.getString( R.string.shop_flow_address ),
                context.getString( R.string.shop_flow_phone ),
                context.getString( R.string.shop_flow_schedule ),
                null,
                R.drawable.shops_flow
        ) );

        list.add( new Location(
                context.getString( R.string.shop_etude_name ),
                context.getString( R.string.shop_etude_description ),
                context.getString( R.string.shop_etude_address ),
                context.getString( R.string.shop_etude_phone ),
                context.getString( R.string.shop_etude_schedule ),
                null,
                R.drawable.shops_etude
        ) );

        list.add( new Location(
                context.getString( R.string.shop_livingbookspace_name ),
                context.getString( R.string.shop_livingbookspace_description ),
                context.getString( R.string.shop_livingbookspace_address ),
                context.getString( R.string.shop_livingbookspace_phone ),
                context.getString( R.string.shop_livingbookspace_schedule ),
                null,
                R.drawable.shops_livingbookspace
        ) );

        list.add( new Location(
                context.getString( R.string.shop_8Five2_name ),
                context.getString( R.string.shop_8Five2_description ),
                context.getString( R.string.shop_8Five2_address ),
                context.getString( R.string.shop_8Five2_phone ),
                context.getString( R.string.shop_8Five2_schedule ),
                null,
                R.drawable.shops_8five2
        ) );
    }
}

