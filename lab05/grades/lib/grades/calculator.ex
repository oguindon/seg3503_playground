defmodule Grades.Calculator do

  def percentage_grade(%{final: f, homework: [h1, h2, h3, h4], labs: [l1, l2, l3, l4, l5, l6], midterm: m}) do
    (Decimal.new(f) |> Decimal.to_float) * 0.3 + (Decimal.new(m) |> Decimal.to_float) * 0.25 + ((Decimal.new(h1) |> Decimal.to_float) + (Decimal.new(h2) |> Decimal.to_float) + (Decimal.new(h3) |> Decimal.to_float) + (Decimal.new(h4) |> Decimal.to_float))/4 * 0.15 + ((Decimal.new(l1) |> Decimal.to_float) + (Decimal.new(l2) |> Decimal.to_float) + (Decimal.new(l3) |> Decimal.to_float) + (Decimal.new(l4) |> Decimal.to_float) + (Decimal.new(l5) |> Decimal.to_float) + (Decimal.new(l6) |> Decimal.to_float))/6 * 0.3
  end
  def letter_grade(%{final: f, homework: [h1, h2, h3, h4], labs: [l1, l2, l3, l4, l5, l6], midterm: m}) do
    grade = (Decimal.new(f) |> Decimal.to_float) * 0.3 + (Decimal.new(m) |> Decimal.to_float) * 0.25 + ((Decimal.new(h1) |> Decimal.to_float) + (Decimal.new(h2) |> Decimal.to_float) + (Decimal.new(h3) |> Decimal.to_float) + (Decimal.new(h4) |> Decimal.to_float))/4 * 0.15 + ((Decimal.new(l1) |> Decimal.to_float) + (Decimal.new(l2) |> Decimal.to_float) + (Decimal.new(l3) |> Decimal.to_float) + (Decimal.new(l4) |> Decimal.to_float) + (Decimal.new(l5) |> Decimal.to_float) + (Decimal.new(l6) |> Decimal.to_float))/6 * 0.3

    cond do
      grade >= 90 ->
        "A+"
      grade >= 85 ->
        "A"
      grade >= 80 ->
        "A-"
      grade >= 75 ->
        "B+"
      grade >= 70 ->
        "B"
      grade >= 65 ->
        "C+"
      grade >= 60 ->
        "C"
      grade >= 55 ->
        "D+"
      grade >= 50 ->
        "D"
      grade >= 40 ->
        "E"
      grade >= 0 ->
        "F"
    end
  end
  def numeric_grade(%{final: f, homework: [h1, h2, h3, h4], labs: [l1, l2, l3, l4, l5, l6], midterm: m}) do
    grade = (Decimal.new(f) |> Decimal.to_float) * 0.3 + (Decimal.new(m) |> Decimal.to_float) * 0.25 + ((Decimal.new(h1) |> Decimal.to_float) + (Decimal.new(h2) |> Decimal.to_float) + (Decimal.new(h3) |> Decimal.to_float) + (Decimal.new(h4) |> Decimal.to_float))/4 * 0.15 + ((Decimal.new(l1) |> Decimal.to_float) + (Decimal.new(l2) |> Decimal.to_float) + (Decimal.new(l3) |> Decimal.to_float) + (Decimal.new(l4) |> Decimal.to_float) + (Decimal.new(l5) |> Decimal.to_float) + (Decimal.new(l6) |> Decimal.to_float))/6 * 0.3

    cond do
      grade >= 90 ->
        10
      grade >= 85 ->
        9
      grade >= 80 ->
        8
      grade >= 75 ->
        7
      grade >= 70 ->
        6
      grade >= 65 ->
        5
      grade >= 60 ->
        4
      grade >= 55 ->
        3
      grade >= 50 ->
        2
      grade >= 40 ->
        1
      grade >= 0 ->
        0
    end
  end

end
