public class MediatorExample {
    public static void main(String[] args) {
        // Create the Auction mediator
        AuctionMediator auctionMediator = new Auction();

        // Create bidders and register them with the auction mediator
        Colleague bidder1 = new Bidder("Alice", auctionMediator);
        Colleague bidder2 = new Bidder("Bob", auctionMediator);
        Colleague bidder3 = new Bidder("Charlie", auctionMediator);

        // Place bids
        bidder1.placeBid(100);
        bidder2.placeBid(150);
        bidder3.placeBid(200);
    }
}