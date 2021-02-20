/**
 * Represents a Request made by one requester to another when a shopping trip is initiated.
 */
public class Request {

    private Person requester;
    private Status status;
    private Item item;
    private int quantityRequested;

    /**
     * Constructs a Request, which has the requester who needs the item, a boolean if the request
     * is accepted, the item to request, and the amount of the item to be requested.
     * @param requester person who is making the requests
     * @param status true if the request was accepted, false otherwise
     * @param item the item to be requested
     * @param quantityRequested the amount of the item to be requested, integer values only
     */
    public Request(Person requester, Status status, Item item, int quantityRequested) {
        this.requester = requester;
        this.status = Status.NORESPONSE;
        this.item = item;
        this.quantityRequested = quantityRequested;
    }

    public void updateRequest(Status update) {
        this.status = update;
    }

    /**
     * The status of the request.
     */
    enum Status {
        ACCEPTED, REJECTED, NORESPONSE
    }
}
