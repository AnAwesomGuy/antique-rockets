package net.anawesomguy.antique_rockets.mixin;

import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.FireworkRocketRecipe;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(FireworkRocketRecipe.class)
public class FireworkRocketRecipeMixin {
    @Redirect(method = "<clinit>", at = @At(value = "FIELD", target = "Lnet/minecraft/item/Items;PAPER:Lnet/minecraft/item/Item;", ordinal = 0))
    private static Item antique_rockets$replacePaperWithBamboo() {
        return Items.BAMBOO;
    }
}
