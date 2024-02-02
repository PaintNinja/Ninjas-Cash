package ga.ozli.minecraftmods.ninjascash.datagen;

import ga.ozli.minecraftmods.ninjascash.CoinItems;
import ga.ozli.minecraftmods.ninjascash.NinjasCash;
import ga.ozli.minecraftmods.ninjascash.NoteItems;
import ga.ozli.minecraftmods.ninjascash.util.NCTags;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class NCRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private final Map<Double, Item> denominationToItemMap = new HashMap<>(){{
        put(0.01, CoinItems.ONE_PENCE.get());
        put(0.02, CoinItems.TWO_PENCE.get());
        put(0.05, CoinItems.FIVE_PENCE.get());
        put(0.1, CoinItems.TEN_PENCE.get());
        put(0.2, CoinItems.TWENTY_PENCE.get());
        put(0.5, CoinItems.FIFTY_PENCE.get());
        put(1.0, CoinItems.ONE_POUND.get());
        put(2.0, CoinItems.TWO_POUNDS.get());
        put(5.0, NoteItems.FIVE_NOTE.get());
        put(10.0, NoteItems.TEN_NOTE.get());
        put(20.0, NoteItems.TWENTY_NOTE.get());
        put(50.0, NoteItems.FIFTY_NOTE.get());
        put(100.0, NoteItems.HUNDRED_NOTE.get());
    }};

    private final double[] denominations = {0.01, 0.02, 0.05, 0.1, 0.2, 0.5, 1.0, 2.0, 5.0, 10.0, 20.0, 50.0, 100.0};

    public NCRecipeProvider(PackOutput packOutput) {
        super(packOutput);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput recipeOutput) {
        ArrayList<ArrayList<Double>> twoPoundsPossibleCrafts = getPossibleCraftCombinations(2.0, denominations, 0, new ArrayList<>());
        ArrayList<ArrayList<Double>> onePoundPossibleCrafts = getPossibleCraftCombinations(1.0, denominations, 0, new ArrayList<>());
        ArrayList<ArrayList<Double>> fiftyPencePossibleCrafts = getPossibleCraftCombinations(0.5, denominations, 0, new ArrayList<>());
        ArrayList<ArrayList<Double>> twentyPencePossibleCrafts = getPossibleCraftCombinations(0.2, denominations, 0, new ArrayList<>());
        ArrayList<ArrayList<Double>> tenPencePossibleCrafts = getPossibleCraftCombinations(0.1, denominations, 0, new ArrayList<>());
        ArrayList<ArrayList<Double>> fivePencePossibleCrafts = getPossibleCraftCombinations(0.05, denominations, 0, new ArrayList<>());
        ArrayList<ArrayList<Double>> twoPencePossibleCrafts = getPossibleCraftCombinations(0.02, denominations, 0, new ArrayList<>());
        ArrayList<ArrayList<Double>> onePencePossibleCrafts = getPossibleCraftCombinations(0.01, denominations, 0, new ArrayList<>());

        ArrayList<ArrayList<Double>> hundredNotePossibleCrafts = getPossibleCraftCombinations(100.0, denominations, 0, new ArrayList<>());
        ArrayList<ArrayList<Double>> fiftyNotePossibleCrafts = getPossibleCraftCombinations(50.0, denominations, 0, new ArrayList<>());
        ArrayList<ArrayList<Double>> twentyNotePossibleCrafts = getPossibleCraftCombinations(20.0, denominations, 0, new ArrayList<>());
        ArrayList<ArrayList<Double>> tenNotePossibleCrafts = getPossibleCraftCombinations(10.0, denominations, 0, new ArrayList<>());
        ArrayList<ArrayList<Double>> fiveNotePossibleCrafts = getPossibleCraftCombinations(5.0, denominations, 0, new ArrayList<>());

        createMoneyRecipes(recipeOutput, twoPoundsPossibleCrafts, CoinItems.TWO_POUNDS.get(), "two_pounds", false);
        createMoneyRecipes(recipeOutput, onePoundPossibleCrafts, CoinItems.ONE_POUND.get(), "one_pound", false);
        createMoneyRecipes(recipeOutput, fiftyPencePossibleCrafts, CoinItems.FIFTY_PENCE.get(), "fifty_pence", false);
        createMoneyRecipes(recipeOutput, twentyPencePossibleCrafts, CoinItems.TWENTY_PENCE.get(), "twenty_pence", false);
        createMoneyRecipes(recipeOutput, tenPencePossibleCrafts, CoinItems.TEN_PENCE.get(), "ten_pence", false);
        createMoneyRecipes(recipeOutput, fivePencePossibleCrafts, CoinItems.FIVE_PENCE.get(), "five_pence", false);
        createMoneyRecipes(recipeOutput, twoPencePossibleCrafts, CoinItems.TWO_PENCE.get(), "two_pence", false);
        createMoneyRecipes(recipeOutput, onePencePossibleCrafts, CoinItems.ONE_PENCE.get(), "one_pence", false);

        createMoneyRecipes(recipeOutput, hundredNotePossibleCrafts, NoteItems.HUNDRED_NOTE.get(), "one_hundred_note", true);
        createMoneyRecipes(recipeOutput, fiftyNotePossibleCrafts, NoteItems.FIFTY_NOTE.get(), "fifty_note", true);
        createMoneyRecipes(recipeOutput, twentyNotePossibleCrafts, NoteItems.TWENTY_NOTE.get(), "twenty_note", true);
        createMoneyRecipes(recipeOutput, tenNotePossibleCrafts, NoteItems.TEN_NOTE.get(), "ten_note", true);
        createMoneyRecipes(recipeOutput, fiveNotePossibleCrafts, NoteItems.FIVE_NOTE.get(), "five_note", true);

        greatestToLowestMoneyRecipe(recipeOutput, NoteItems.HUNDRED_NOTE.get(), NoteItems.FIFTY_NOTE.get(), 2, "fifty_note", "one_hundred_to_fifty");
        greatestToLowestMoneyRecipe(recipeOutput, NoteItems.FIFTY_NOTE.get(), NoteItems.TEN_NOTE.get(), 5, "ten_note", "fifty_to_ten");
        greatestToLowestMoneyRecipe(recipeOutput, NoteItems.TWENTY_NOTE.get(), NoteItems.TEN_NOTE.get(), 2, "ten_note", "twenty_to_ten");
        greatestToLowestMoneyRecipe(recipeOutput, NoteItems.TEN_NOTE.get(), NoteItems.FIVE_NOTE.get(), 2, "five_note", "ten_to_five");
        greatestToLowestMoneyRecipe(recipeOutput, NoteItems.FIVE_NOTE.get(), CoinItems.ONE_POUND.get(), 5, "one_pound", "five_to_one_pound");
        greatestToLowestMoneyRecipe(recipeOutput, CoinItems.TWO_POUNDS.get(), CoinItems.ONE_POUND.get(), 2, "one_pound", "two_pounds_to_one_pound");
        greatestToLowestMoneyRecipe(recipeOutput, CoinItems.ONE_POUND.get(), CoinItems.FIFTY_PENCE.get(), 2, "fifty_pence", "one_pound_to_fifty_pence");
        greatestToLowestMoneyRecipe(recipeOutput, CoinItems.FIFTY_PENCE.get(), CoinItems.TEN_PENCE.get(), 5, "ten_pence", "fifty_pence_to_ten_pence");
        greatestToLowestMoneyRecipe(recipeOutput, CoinItems.TWENTY_PENCE.get(), CoinItems.TEN_PENCE.get(), 2, "ten_pence", "twenty_pence_to_ten_pence");
        greatestToLowestMoneyRecipe(recipeOutput, CoinItems.TEN_PENCE.get(), CoinItems.FIVE_PENCE.get(), 2, "five_pence", "ten_pence_to_five_pence");
        greatestToLowestMoneyRecipe(recipeOutput, CoinItems.FIVE_PENCE.get(), CoinItems.ONE_PENCE.get(), 5, "one_pence", "five_pence_to_one_pence");
        greatestToLowestMoneyRecipe(recipeOutput, CoinItems.TWO_PENCE.get(), CoinItems.ONE_PENCE.get(), 2, "one_pence", "two_pence_to_one_pence");

        forgedNoteRecipe(recipeOutput);
    }

    private void forgedNoteRecipe(RecipeOutput recipeOutput) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, NoteItems.FORGED_NOTE.get())
                .requires(Items.PAPER, 9)
                .unlockedBy("has_any_money", has(NCTags.MONEYS))
                .save(recipeOutput);
    }

    private void greatestToLowestMoneyRecipe(RecipeOutput recipeOutput, Item from, Item to, int toAmount, String groupName, String recipeName) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, to, toAmount)
                .requires(from)
                .group(groupName)
                .unlockedBy("has_any_money", has(NCTags.MONEYS))
                .save(recipeOutput, new ResourceLocation(NinjasCash.MOD_ID, recipeName));
    }

    private void createMoneyRecipes(RecipeOutput recipeOutput, ArrayList<ArrayList<Double>> possibleCrafts, Item result, String groupName, boolean isNote) {
        int i = 1;
        for (ArrayList<Double> crafts : possibleCrafts) {
            ShapelessRecipeBuilder builder = ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, result);

            for (double denomination : crafts) {
                Item item = denominationToItemMap.get(denomination);
                if (item == null) return;

                builder.requires(item);
            }

            boolean containsCoin = crafts.stream().anyMatch(denomination -> denomination < 5.0);
            if (containsCoin && isNote)
                if (crafts.size() < 9)
                    builder.requires(Items.PAPER);
                else continue;

            builder.group(groupName)
                   .unlockedBy("has_any_money", has(NCTags.MONEYS))
                   .save(recipeOutput, new ResourceLocation(NinjasCash.MOD_ID,groupName + i));

            i++;
        }
    }

    private ArrayList<ArrayList<Double>> getPossibleCraftCombinations(double amount, double[] denominations, int index, ArrayList<Double> current) {
        ArrayList<ArrayList<Double>> result = new ArrayList<>();

        if (Math.abs(amount) < 0.001 && current.size() <= 9 && !(current.size() == 1)) {
            result.add(new ArrayList<>(current));
            return result;
        }

        if (amount < 0 || index == denominations.length || current.size() > 9)
            return result;

        double denomination = denominations[index];
        for (int i = 0; i <= amount / denomination; i++) {
            current.addAll(Collections.nCopies(i, denomination));
            result.addAll(getPossibleCraftCombinations(amount - i * denomination, denominations, index + 1, current));
            current.subList(current.size() - i, current.size()).clear();
        }

        return result;
    }
}
