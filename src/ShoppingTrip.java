import java.util.ArrayList;

/**
 * Represents a group of {@param Peron}s going food shopping,
 * allows other {@param Person}s to request those that are shopping to purchase something for them
 */
public class ShoppingTrip {
    private ArrayList<Person> people;
    private ArrayList<RequestList> requestList;
    private ArrayList<Request> acceptedRequests;
    private boolean isEnd;
    private String store;

    /**
     * Initializes a ShoppingTrip with the given parameters
     *
     * @param people Persons going on this ShoppingTrip
     * @param store which store the shopping trip is at
     *
     */
    public ShoppingTrip(ArrayList<Person> people, String store) {
        this.people = people;
        this.requestList = new ArrayList<RequestList>();
        this.acceptedRequests = new ArrayList<Request>();
        this.isEnd = false;
        this.store = store;
    }

    void addRequest(Request request) {
        this.acceptedRequests.add(request);
    }

    /**
     * Adds this RequestList to the list of RequestLists
     *
     * @param requestList the RequestList being added
     *
     */
    void addRequests(RequestList requestList) {
        if (!isEnd) {
            this.requestList.add(requestList);
        }
    }

    void withdrawRequestList(RequestList list) {
        if (requestList.contains(list)) {
            requestList.remove(list);
        }
        for (Request request: list.getRequests()) {
            if (acceptedRequests.contains(request)) {
                acceptedRequests.remove(request);
            }
        }
        // maybe error handling instead
    }

    /**
     * Ends this ShoppingTrip.
     */
    void endTrip() {
        this.isEnd = true;
    }
}
