using UnityEngine;
using UnityEngine.UI;

public class DistanceToCheckpoint : MonoBehaviour {

    // Reference to checkpoint position
    [SerializeField]
    private Transform checkpoint;

    // Reference to UI text that shows the distance value
    [SerializeField]
    private Text distanceText;

    // Calculated distance value
    private float distance;

    // Update is called once per frame
    private void Update () {

        // Calculate distance value by X axis
        distance = (checkpoint.transform.position.x - transform.position.x);

        // Display distance value via UI text
        // distance.ToString("F1") shows value with 1 digit after period
        // so 12.234 will be shown as 12.2 for example
        // distance.ToString("F2") will show 12.23 in this case
        distanceText.text = "Distance: " + distance.ToString("F1") + " meters";

        // If Cat reaches checkpoint then distance text shows "Finish!" word
        if (distance <= 0)
        {
            distanceText.text = "Finish!";
        }
	}
}
