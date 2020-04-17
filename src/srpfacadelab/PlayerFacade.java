package srpfacadelab;

import java.util.List;
import java.util.ArrayList;

public class PlayerFacade 
{
   public void useItemFacade(Item item, List<IEnemy> enemies) 
   {
      if (item.getName().equals("Stink Bomb"))
      {
          for (IEnemy enemy: enemies)
          {
              enemy.takeDamage(100);
          }
      }
   }

   public boolean GreenSwirlCheck(Item item)
   {
      if (item.getHeal() > 500) 
         return true;
      return false;
   }

   public void rarityEffectCheck(Item item, IGameEngine gameEngine)
   {
      if (item.isRare())
            gameEngine.playSpecialEffect("cool_swirly_particles");

        if (item.isRare() && item.isUnique())
            gameEngine.playSpecialEffect("blue_swirly");

   }

   public boolean ItemInvCheck(Item item, List<Item> inventory) 
   {
      for (Item i: inventory) {
         if (i.getId() == item.getId())
            return true;
      }
      return false;
   }

}