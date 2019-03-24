  //order.addChild(new Leaf("The Purist", 8.00 ));

public class BuildOrder {

    public static Component getOrder()
    {
        Composite order = new Composite( "Order" ) ;
        //order.addChild(new Leaf("Crispy Onion Strings", 5.50 ));
        //order.addChild(new Leaf("The Purist", 8.00 ));

        CustomBurger customBurger = new CustomBurger( "Build Your Own Burger 19.5" ) ;
        // base price for 1/3 lb
        Burger b = new Burger( "Burger Options" ) ;
        String[] bo = { "Organic Bison", "1/2lb.", "On A Bun" } ;
        b.setOptions( bo ) ;
        
        Cheese c = new Cheese( "Cheese Options" ) ;
        String[] co = {"Yellow American", "Spicy Jalapeno Jack"  } ;
        c.setOptions( co ) ;
        c.wrapDecorator( b ) ;
        
        
        Premium p = new Premium( "Premium Options" ) ;
        String[] po = { "Danish Blue Cheese" } ;
        p.setOptions( po ) ;
        p.wrapDecorator( c) ;
  
       
        Sauce s = new Sauce( "Sauce Options" ) ;
        String[] so = { "Mayonaise","Thai Peanut Sauce" } ;
        s.setOptions( so ) ;
        s.wrapDecorator( p ) ;
        
        
              
         Toppings t = new Toppings( "Toppings Options" ) ;
        String[] to = { "Dill Pickle Chips","Black Olives", "Spicy Pickles" } ;
        t.setOptions( to ) ;
        t.wrapDecorator( s ) ;
        
          PremiumToppings pt  = new PremiumToppings( "Premium toppings Toppings Options" ) ;
        String[] pto = { "Marinated tomatoes"} ;
        pt.setOptions( pto ) ;
        pt.wrapDecorator( t ) ;
        
        
           Bun bun  = new Bun( "Bun Toppings Options" ) ;
        String[] buno = { "Gluten free bun"} ;
        bun.setOptions( buno ) ;
        bun.wrapDecorator( pt ) ;
        
           Side sc  = new Side( "Side Options" ) ;
        String[] sco = { "Shoestring fries"} ;
        sc.setOptions( sco ) ;
        sc.wrapDecorator( bun ) ;
        // Setup Custom Burger Ingredients
        customBurger.setDecorator( sc ) ;
        customBurger.addChild( b ) ;
        customBurger.addChild( c ) ;
        customBurger.addChild( p ) ;
        customBurger.addChild( s) ;
        customBurger.addChild( t ) ;
         customBurger.addChild( pt ) ;
          customBurger.addChild( bun) ; 
          customBurger.addChild( sc ) ;
        
        // Add Custom Burger to the ORder
        order.addChild( customBurger );  

        
        return order ;
        
    }

}


/*

Counter Burger Menu:
https://thecounterburger.emn8.com/?store=Times%20Square

*/