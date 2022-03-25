package me.teakivy.teakstweaks.CraftingTweaks.Recipes;

import me.teakivy.teakstweaks.CraftingTweaks.AbstractRecipe;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;

import java.util.ArrayList;
import java.util.List;

public class CraftableCoral2x2 extends AbstractRecipe {

    public CraftableCoral2x2() {
        super("Craftable Coral 2x2");
    }

    @Override
    public void registerRecipes() {
        newCoralRecipe("TUBE");
        newCoralRecipe("BRAIN");
        newCoralRecipe("BUBBLE");
        newCoralRecipe("FIRE");
        newCoralRecipe("HORN");
    }

    private static void newCoralRecipe(String type) {
        NamespacedKey key = new NamespacedKey(main, type.toLowerCase() + "_vt_coral_2x2");

        ShapedRecipe recipe = new ShapedRecipe(key, new ItemStack(Material.valueOf(type.toUpperCase() + "_CORAL_BLOCK")));

        List<Material> choiceList = new ArrayList<Material>();
        choiceList.add(Material.valueOf(type + "_CORAL"));
        choiceList.add(Material.valueOf(type + "_CORAL_FAN"));

        RecipeChoice choice = new RecipeChoice.MaterialChoice(choiceList);

        recipe.shape("xx", "xx");
        recipe.setIngredient('x', choice);

        Bukkit.addRecipe(recipe);
    }
}
