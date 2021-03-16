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

    /**
     * Returns the list of requests.
     * @return list of requests
     */
    public ArrayList<Request> getRequests() {
        return new ArrayList<Request>(requests);
    }

    /**
     * Adds a new request to the current list of requests.
     * @param newRequest represents request to be added
     */
    public void addRequest(Request newRequest) {
        this.requests.add(newRequest);
    }

    /**
     * Removes the given {Request} from the current list of requests if it exists
     *
     * @param newRequest                    represents request to be removed
     * @throws IllegalArgumentException     if newRequest is not in this.requests     */
    public void removeRequest(Request newRequest) {
        if (this.requests.contains(newRequest)) {
            this.requests.add(newRequest);
        }
        else {
            throw new IllegalArgumentException("Request is not in List!");
        }
    }


}
