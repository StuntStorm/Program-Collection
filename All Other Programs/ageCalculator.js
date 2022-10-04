const calculateAge = (birthDay, birthMonth, birthYear) => {
    let date = new Date();
    let currentDay = date.getDate();
    let currentMonth = 1 + date.getMonth();
    let currentYear = date.getFullYear();
    let monthsLength = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31];
    
    if (birthDay > currentDay) {
        currentDay = currentDay + monthsLength[currentMonth - 1]
        currentMonth -= 1;
    }
    
    if (birthMonth > currentMonth) {
        currentMonth += 12;
        currentYear -= 1;
    }
    
    let day = currentDay - birthDay;
    let month = currentMonth - birthMonth;
    let year = currentYear - birthYear;
    
    return `Your Age is ${year} Years, ${month} Months and ${day} Days`;
}