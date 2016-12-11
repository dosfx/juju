package ca.dosfx.juju.item;

/**
 * Created by Dos on 2016-12-04.
 */
public class ItemUtil
{
    private static final String AxeSuffix = "_axe";
    private static final String GemSuffix = "_gem";
    private static final String HoeSuffix = "_hoe";
    private static final String PickaxeSuffix = "_pickaxe";
    private static final String SpadeSuffix = "_spade";
    private static final String SwordSuffix = "_sword";

    public static String getAxeName(String name)
    {
        return getName(name, AxeSuffix);
    }

    public static String getGemName(String name)
    {
        return getName(name, GemSuffix);
    }

    public static String getHoeName(String name)
    {
        return getName(name, HoeSuffix);
    }

    public static String getPickaxeName(String name)
    {
        return getName(name, PickaxeSuffix);
    }

    public static String getSpadeName(String name)
    {
        return getName(name, SpadeSuffix);
    }

    public static String getSwordName(String name)
    {
        return getName(name, SwordSuffix);
    }

    private static String getName(String name, String postfix)
    {
        return name.toLowerCase() + postfix;
    }
}
