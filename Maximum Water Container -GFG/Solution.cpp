int maxWaterContainer(vector<int>& arr) {
    int left = 0, right = arr.size() - 1;
    int maxArea = 0;

    while (left < right) {
        // Calculate the current area
        int height = std::min(arr[left], arr[right]);
        int width = right - left;
        int currentArea = height * width;

        // Update maximum area
        maxArea = std::max(maxArea, currentArea);

        // Move the pointers
        if (arr[left] < arr[right]) {
            ++left;
        } else {
            --right;
        }
    }

    return maxArea;
}

int main() {
    std::vector<int> arr = {1, 5, 4, 3};
    std::cout << "Maximum water that can be contained: " << maxWaterContainer(arr) << std::endl;
    return 0;
}