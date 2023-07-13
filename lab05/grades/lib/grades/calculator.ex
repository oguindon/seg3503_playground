defmodule Grades.Calculator do

  def percentage_grade(%{final: f, homework: [h1, h2, h3, h4], labs: [l1, l2, l3, l4, l5, l6], midterm: m}), do: 100
  def letter_grade(%{final: f, homework: [h1, h2, h3, h4], labs: [l1, l2, l3, l4, l5, l6], midterm: m}), do: 100
  def numeric_grade(%{final: f, homework: [h1, h2, h3, h4], labs: [l1, l2, l3, l4, l5, l6], midterm: m}), do: 100

end
