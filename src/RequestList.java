import java.util.ArrayList;

/**
 * A list of items that a person requests for when another user goes to the sto
 * This is not a list that the user physically sees and maintains. When users send
 * items that they would like to request to another user, this list is used.
 */
public class RequestList extends ItemList {
    private Person requester;
    private ArrayList<Request> requests;

    /**
     * Initializes a RequestList with the given parameters.
     *
     * @param requester Person who is making requests
     * @param requests a list of Requests being made
     *
     */
    public RequestList(Person requester, ArrayList<Request> requests) {
        this.requester = requester;
        this.requests = requests;
    }

    public ArrayList<Request> getRequests() {
        return new ArrayList<Request>(requests);
    }
    public void addRequest(Request newRequest) {
        this.requests.add(newRequest);
    }


}
