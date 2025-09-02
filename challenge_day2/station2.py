from datetime import datetime

def get_day_of_week(date_str):
    date_obj = datetime.strptime(date_str, "%Y-%m-%d")
    return date_obj.strftime("%A")

def solution_station_2(date_input):
    day_of_week = get_day_of_week(date_input)

    if day_of_week == "Monday":
        return "月曜日"
    elif day_of_week == "Tuesday":
        return "火曜日"
    elif day_of_week == "Wednesday":
        return "水曜日"
    elif day_of_week == "Thursday":
        return "木曜日"
    elif day_of_week == "Friday":
        return "金曜日"
    elif day_of_week == "Saturday":
        return "土曜日"
    elif day_of_week == "Sunday":
        return "日曜日"
